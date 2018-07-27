package com.qochealth.qoctest.common.activities

import android.support.v7.app.AppCompatActivity
import com.qochealth.qoctest.common.controls.SpinnerDialogFragment
import com.qochealth.qoctest.common.protocols.BaseInterface


/**
 * Created by ahmedsaad on 2017-11-03.
 * Copyright © 2017. All rights reserved.
 */
open class BaseActivity: AppCompatActivity(), BaseInterface {
    override var spinner: SpinnerDialogFragment? = null
}