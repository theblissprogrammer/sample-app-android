package com.qochealth.qoctest.common.routers

import android.support.v4.app.Fragment
import com.qochealth.qoctest.R
import java.lang.ref.WeakReference

/**
 * Created by ahmedsaad on 2018-01-17.
 * Copyright © 2017. All rights reserved.
 */
interface AppRoutable {
    var fragment: WeakReference<Fragment?>

    fun dismiss(isFragment: Boolean = false) {
        if (isFragment) {
            fragment.get()?.fragmentManager?.popBackStack() ?: fragment.get()?.activity?.finish()
        } else {
            fragment.get()?.activity?.finish()
        }
    }

    fun show(fragment: Fragment) {
        this.fragment.get()?.fragmentManager
                ?.beginTransaction()
                ?.setCustomAnimations(R.anim.right_enter, R.anim.left_exit, R.anim.left_enter, R.anim.right_exit)
                ?.replace(R.id.base_fragment, fragment,
                        fragment::class.java.simpleName)
                ?.addToBackStack(fragment::class.java.simpleName)
                ?.commit()
    }
}