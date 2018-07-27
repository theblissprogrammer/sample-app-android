package com.qochealth.qoctest.scenes.listEntries

import android.support.v4.app.Fragment
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesRoutable
import com.qochealth.qoctest.scenes.showEntry.ShowEntryFragment
import java.lang.ref.WeakReference

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class ListEntriesRouter(override var fragment: WeakReference<Fragment?>): ListEntriesRoutable {

    override fun showEntry(id: Int) {
        val showEntryFragment = ShowEntryFragment()
        showEntryFragment.entryID = id

        show(fragment = showEntryFragment)
    }

}