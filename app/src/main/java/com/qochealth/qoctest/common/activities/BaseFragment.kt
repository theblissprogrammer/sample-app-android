package com.qochealth.qoctest.common.activities

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.controls.SpinnerDialogFragment
import com.qochealth.qoctest.common.protocols.BaseInterface

/**
 * Created by ahmedsaad on 2018-01-18.
 * Copyright © 2017. All rights reserved.
 */
open class BaseFragment: Fragment(), BaseInterface {
    override var spinner: SpinnerDialogFragment? = null

    protected var isFirstRun: Boolean = false

    fun setTitle(title: String) {
        (activity as? AppCompatActivity)?.supportActionBar?.title = title
    }

    fun setSubTitle(title: String) {
        (activity as? AppCompatActivity)?.supportActionBar?.subtitle = title
    }

    fun setHomeAsUp(value: Boolean = false) {

        if (value) {
            (activity as? AppCompatActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
            (activity as? AppCompatActivity)?.supportActionBar?.setDisplayShowHomeEnabled(true)
        } else {
            (activity as? AppCompatActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(false)
            (activity as? AppCompatActivity)?.supportActionBar?.setDisplayShowHomeEnabled(false)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isFirstRun = true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? AppCompatActivity)?.setSupportActionBar(view.findViewById(R.id.toolbar))
    }

    override fun onStop() {
        super.onStop()
        isFirstRun = false
    }
}