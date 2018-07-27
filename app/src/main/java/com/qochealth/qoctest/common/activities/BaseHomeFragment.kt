package com.qochealth.qoctest.common.activities

import android.os.Bundle
import android.view.*
import com.qochealth.qoctest.R
import com.qochealth.qoctest.scenes.listEntries.ListEntriesFragment

/**
 * Created by ahmedsaad on 2018-01-22.
 * Copyright © 2017. All rights reserved.
 */
class BaseHomeFragment: BaseNavigationFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            childFragmentManager
                    .beginTransaction()
                    ?.replace(R.id.base_fragment, ListEntriesFragment(),
                            ListEntriesFragment::class.java.simpleName)
                    ?.commit()
        }

    }
}