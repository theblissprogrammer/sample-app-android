package com.qochealth.qoctest.common.app

import com.qochealth.qoctest.BuildConfig
import com.example.coreandroid.sources.controls.ApplicationService

/**
 * Created by ahmedsaad on 2018-04-03.
 * Copyright © 2018. All rights reserved.
 */
class LoggerApplicationService: ApplicationService {
    override fun onCreate() {
        //Logger.setupLogger(appVersion = BuildConfig.VERSION_NAME, appBuild = BuildConfig.VERSION_CODE)
    }
}