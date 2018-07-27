package com.qochealth.qoctest.common.app

import android.app.Activity
import com.example.appstores.sources.dependencies.HasDependencies
import com.example.coreandroid.sources.controls.ApplicationService
import com.example.coreandroid.sources.data.DataWorkerType

/**
 * Created by ahmedsaad on 2018-02-06.
 * Copyright © 2017. All rights reserved.
 */
class DataApplicationService: ApplicationService, HasDependencies {

    private val dataWorker: DataWorkerType by lazy {
        dependencies.resolveDataWorker()
    }

    override fun onCreate() {
        dataWorker.configure()
    }

    override fun onActivityResumed(activity: Activity?) {
    }
}