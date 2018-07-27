package com.example.appstores.sources.stores.entries

import com.example.appstores.sources.stores.entries.models.EntryType
import com.example.coreandroid.sources.common.CompletionResponse.Companion.failure
import com.example.coreandroid.sources.common.CompletionResponse.Companion.success
import com.example.coreandroid.sources.common.DispatchGroup
import com.example.coreandroid.sources.common.Result
import com.example.coreandroid.sources.errors.DataError
import com.example.coreandroid.sources.extensions.Android
import com.example.coreandroid.sources.logging.LogHelper
import kotlinx.coroutines.experimental.launch
import java.io.IOException

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class EntriesWorker(val store: EntriesStore, val cacheStore: EntriesCacheStore?): EntriesWorkerType {

    override fun fetch(completion: Result<List<EntryType>, DataError>) {
        launch(Android) {
            try {
                // Use cache storage if applicable
                if (cacheStore == null) {
                    val entries = store.fetch().await()
                    completion(entries)
                    return@launch
                }

                val cacheEntries = cacheStore.fetch().await()

                /// Immediately return local response
                completion(cacheEntries)

                if (cacheEntries.value == null || !cacheEntries.isSuccess) {
                    return@launch
                }

                val entries = store.fetch().await()

                // Validate if any updates that needs to be stored
                if (entries.value == null || !entries.isSuccess) {
                    return@launch
                }

                val taskGroup = DispatchGroup()
                var hasTasks = false

                // Remove deleted items
                cacheEntries
                        .value
                        ?.filter { element -> entries.value?.find { it.id == element.id} == null }
                        ?.forEach {
                            taskGroup.enter()

                            val delete = cacheStore.delete(id = it.id).await()
                            if (!delete.isSuccess) {
                                LogHelper.e(messages = *arrayOf("Could not delete entry locally " +
                                        "from remote storage: ${delete.error?.localizedMessage ?: ""}"))
                            }

                            hasTasks = true
                            taskGroup.leave()
                        }

                // Add or update modified items
                entries
                        .value
                        ?.forEach {
                            taskGroup.enter()

                            val entry = cacheStore.createOrUpdate(it).await()
                            if (!entry.isSuccess) {
                                LogHelper.e(messages = *arrayOf("Could not save new or updated " +
                                        "entry locally from remote storage: ${entry.error?.localizedMessage ?: ""}"))
                            }

                            hasTasks = true
                            taskGroup.leave()
                        }

                taskGroup.notify(Runnable {
                    // Callback handler again if updated
                    if (!hasTasks) {
                        return@Runnable
                    }

                    completion(success(entries.value))
                })
            } catch (e: IOException){
                completion(failure(
                        DataError.NetworkFailure(e)
                ))
            }
        }
    }

    override fun fetch(id: Int, completion: Result<EntryType, DataError>) {
        if (cacheStore == null) {
            return fetch {
                if (it.value == null || !it.isSuccess) {
                    completion(failure(it.error))
                    return@fetch
                }

                val entry = it.value?.firstOrNull { it.id == id }

                completion(success(entry))
            }
        }

        launch(Android) {
            try {
                val entry = cacheStore.fetch(id = id).await()
                completion(entry)
            } catch (e: IOException){
                completion(failure(
                        DataError.NetworkFailure(e)
                ))
            }
        }
    }

}