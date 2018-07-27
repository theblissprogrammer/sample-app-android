package com.qochealth.qoctest.common.activities

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.protocols.NavigationInterface
import java.lang.ref.WeakReference

abstract class BaseNavigationFragment: Fragment(), NavigationInterface {
    companion object {
        val fragmentBackStack = arrayListOf<WeakReference<Fragment>>()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base, container, false)
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

        synchronized(BaseNavigationFragment::class.java) {
            fragmentBackStack.add(WeakReference(fragment))
        }
    }

    override fun onBackPressed() {
        if (childFragmentManager.backStackEntryCount > 0)
            childFragmentManager.popBackStack()
    }
}