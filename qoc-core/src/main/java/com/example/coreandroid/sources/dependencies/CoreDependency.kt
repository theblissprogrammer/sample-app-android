package com.example.coreandroid.sources.dependencies

import android.app.Application
import android.content.Context
import com.example.coreandroid.sources.network.HTTPService
import com.example.coreandroid.sources.network.HTTPServiceType
import com.example.coreandroid.sources.data.*

/**
 * Created by ahmedsaad on 2017-11-30.
 * Copyright © 2017. All rights reserved.
 */
open class CoreDependency: CoreDependable {

    override var application: Application? = null

    override fun resolveContext(): Context? {
        return application?.applicationContext
    }

    // Workers

    override fun resolveDataWorker(): DataWorkerType {
        return DataWorker(store = resolveDataStore())
    }

    // Stores

    override fun resolveDataStore(): DataStore {
        return DataRealmStore()
    }

    // Services

    override fun resolveHTTPService(): HTTPServiceType {
        return HTTPService()
    }
}