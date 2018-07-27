package com.example.appstores.sources.stores.entries

import com.example.appstores.sources.extensions.realmCoroutine
import com.example.appstores.sources.stores.entries.models.Entry
import com.example.appstores.sources.stores.entries.models.EntryRealmObject
import com.example.appstores.sources.stores.entries.models.EntryType
import com.example.coreandroid.sources.common.CompletionResponse
import com.example.coreandroid.sources.errors.DataError
import kotlinx.coroutines.experimental.Deferred

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class EntriesRealmStore: EntriesCacheStore {

    override fun fetch(): Deferred<CompletionResponse<List<EntryType>, DataError>> {
        return realmCoroutine<List<EntryType>, DataError> { realm ->
            val list = realm.where(EntryRealmObject::class.java)
                    .findAll().mapNotNull { Entry(it) }
            CompletionResponse.success(list)
        }
    }

    override fun fetch(id: Int): Deferred<CompletionResponse<EntryType, DataError>> {
        return realmCoroutine<EntryType, DataError> { realm ->
            val item = realm.where(EntryRealmObject::class.java)
                    .equalTo("id", id)
                    .findFirst()

            if (item == null) {
                CompletionResponse.failure(DataError.NonExistent)
            } else {

                CompletionResponse.success(Entry(item))
            }
        }
    }

    override fun createOrUpdate(request: EntryType): Deferred<CompletionResponse<EntryType, DataError>>  {
        return realmCoroutine<EntryType, DataError> { realm ->
            realm.executeTransaction {
                realm.insertOrUpdate(EntryRealmObject(request))
            }

            // Get refreshed object to return
            val item = realm.where(EntryRealmObject::class.java)
                    .equalTo("id", request.id)
                    .findFirst()

            if (item == null) {
                CompletionResponse.failure(DataError.NonExistent)
            } else {

                CompletionResponse.success(Entry(item))
            }
        }
    }

    override fun delete(id: Int): Deferred<CompletionResponse<Void, DataError>> {
        return realmCoroutine<Void, DataError> { realm ->
            val realmObject = realm.where(EntryRealmObject::class.java)
                    .equalTo("id", id)
                    .findFirst()

            realm.executeTransaction {
                realmObject?.deleteFromRealm()
            }
            CompletionResponse.success(null)
        }
    }
}