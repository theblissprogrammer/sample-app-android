package com.example.coreandroid.sources.dependencies

import android.app.Application
import android.content.Context
import com.example.coreandroid.sources.network.HTTPServiceType
import com.example.coreandroid.sources.data.DataStore
import com.example.coreandroid.sources.data.DataWorkerType

/**
 * Created by ahmedsaad on 2017-11-29.
 * Copyright © 2017. All rights reserved.
 */
interface CoreDependable {
    var application: Application?

    fun resolveContext(): Context?

    fun resolveDataWorker(): DataWorkerType

    fun resolveDataStore(): DataStore

    fun resolveHTTPService(): HTTPServiceType
}