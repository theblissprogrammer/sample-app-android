package com.qochealth.qoctest.common.activities

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.protocols.NavigationInterface
import com.qochealth.qoctest.scenes.listEntries.ListEntriesFragment
import java.lang.ref.WeakReference

/**
 * Created by ahmedsaad on 2018-01-22.
 * Copyright © 2017. All rights reserved.
 */
class BaseHomeFragment: Fragment(), NavigationInterface {

    companion object {
        val fragmentBackStack = arrayListOf<WeakReference<Fragment>>()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base, container, false)
    }

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

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)

        if (!hidden) {
            fragmentBackStack.firstOrNull {
                val fragment = it.get()
                fragment != null && fragment.isAdded && fragment.isVisible }
                    ?.get()?.onHiddenChanged(hidden)
        }
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)

        synchronized(BaseHomeFragment::class.java) {
            fragmentBackStack.add(WeakReference(fragment))
        }
    }

    override fun onBackPressed() {
        if (childFragmentManager.backStackEntryCount > 0)
            childFragmentManager.popBackStack()
    }
}