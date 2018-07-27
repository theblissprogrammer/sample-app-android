package com.example.appstores.sources.stores.entries

import com.example.appstores.sources.stores.entries.models.EntryType
import com.example.coreandroid.sources.common.CompletionResponse
import com.example.coreandroid.sources.common.Result
import com.example.coreandroid.sources.errors.DataError
import kotlinx.coroutines.experimental.Deferred

/**
 * Created by ahmedsaad on 2018-07-26.
 */
interface EntriesStore {
    fun fetch(): Deferred<CompletionResponse<List<EntryType>, DataError>>
}

interface EntriesCacheStore: EntriesStore {
    fun fetch(id: Int): Deferred<CompletionResponse<EntryType, DataError>>
    fun createOrUpdate(request: EntryType): Deferred<CompletionResponse<EntryType, DataError>>
    fun delete(id: Int): Deferred<CompletionResponse<Void, DataError>>
}

interface EntriesWorkerType {
    fun fetch(completion: Result<List<EntryType>, DataError>)
    fun fetch(id: Int, completion: Result<EntryType, DataError>)
}