package com.example.appstores.sources.stores.entries

import com.example.appstores.sources.stores.entries.models.EntryType
import com.example.appstores.sources.stores.entries.models.FeedsWrapper
import com.example.coreandroid.sources.common.CompletionResponse
import com.example.coreandroid.sources.common.initDataError
import com.example.coreandroid.sources.errors.DataError
import com.example.coreandroid.sources.logging.LogHelper
import com.example.coreandroid.sources.network.HTTPServiceType
import com.google.gson.Gson
import kotlinx.coroutines.experimental.*

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class EntriesNetworkStore(val httpService: HTTPServiceType): EntriesStore {

    override fun fetch(): Deferred<CompletionResponse<List<EntryType>, DataError>> {
       return async(CommonPool) {
            val result = httpService.get(
                    url = "http://phobos.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/toppaidapplications/limit=100/json")
            if (result.value == null || !result.isSuccess) {
                val exception = initDataError(result.error)
                LogHelper.e(messages = *arrayOf("An error occurred while fetching entries: " +
                        exception.localizedMessage))

                CompletionResponse.failure(exception)
            } else {

                try {
                    // Parse response data
                    val payload = Gson().fromJson(result.value?.data, FeedsWrapper::class.java).feed.entries
                    CompletionResponse.success<List<EntryType>, DataError>(payload)
                } catch (e: Exception) {
                    LogHelper.e(messages = *arrayOf("An error occurred while parsing entries: " +
                            e.localizedMessage))
                    CompletionResponse.failure<List<EntryType>, DataError>(DataError.ParseFailure(e))
                }
            }
        }
    }
}