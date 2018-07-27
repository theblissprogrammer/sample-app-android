package com.qochealth.qoctest.common.cleanBase

import com.qochealth.qoctest.common.activities.BaseActivity
import com.qochealth.qoctest.common.activities.BaseFragment

/**
 * Created by ahmedsaad on 2018-01-22.
 * Copyright © 2017. All rights reserved.
 */
interface AppDisplayable {
    fun display(error: AppModels.Error) {
        when (this) {
            is BaseFragment -> {
                hideSpinner()
                this.present(title = error.title, message = error.message)
            }
            is BaseActivity -> {
                hideSpinner()
                this.present(title = error.title, message = error.message)
            }
            else -> {}
        }
    }

    fun displaySupport(error: AppModels.Error) {
        //TODO: Implement support dialog
        display(error)
    }
}