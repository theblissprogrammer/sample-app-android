package com.example.appstores.sources.dependencies

import com.example.appstores.sources.stores.entries.*
import com.example.coreandroid.sources.dependencies.CoreDependency

open class StoreDependency: CoreDependency(), StoreDependable {

    override fun resolveEntriesWorker(): EntriesWorkerType {
        return EntriesWorker(
                store = resolveEntriesNetworkStore(),
                cacheStore = resolveEntriesCacheStore()
        )
    }

    override fun resolveEntriesNetworkStore(): EntriesStore {
        return EntriesNetworkStore(
                httpService = resolveHTTPService()
        )
    }

    override fun resolveEntriesCacheStore(): EntriesCacheStore {
        return EntriesRealmStore()
    }
}