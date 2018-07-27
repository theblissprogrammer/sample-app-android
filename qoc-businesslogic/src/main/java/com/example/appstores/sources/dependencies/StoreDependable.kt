package com.example.appstores.sources.dependencies

import com.example.appstores.sources.stores.entries.EntriesCacheStore
import com.example.appstores.sources.stores.entries.EntriesStore
import com.example.appstores.sources.stores.entries.EntriesWorkerType
import com.example.coreandroid.sources.dependencies.CoreDependable


/**
 * Created by ahmedsaad on 2017-11-29.
 * Copyright © 2017. All rights reserved.
 */
interface StoreDependable: CoreDependable {
    fun resolveEntriesWorker(): EntriesWorkerType
    fun resolveEntriesNetworkStore(): EntriesStore
    fun resolveEntriesCacheStore(): EntriesCacheStore
}