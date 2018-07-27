package com.qochealth.qoctest.scenes.main

import android.os.Bundle
import android.view.MenuItem
import com.example.appstores.sources.dependencies.HasDependencies
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.activities.BaseActivity
import com.qochealth.qoctest.common.activities.BaseHomeFragment
import com.qochealth.qoctest.common.protocols.NavigationInterface

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class MainActivity: BaseActivity(), HasDependencies {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Make sure this is before calling super.onCreate
        setTheme(R.style.AppTheme_NoActionBar)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                .add(R.id.main_fragment, BaseHomeFragment(), BaseHomeFragment::class.java.simpleName)
                .commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        when (id) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }

    override fun onBackPressed() {
        val fragment = supportFragmentManager.fragments.firstOrNull { it.isAdded && it.isVisible }

        when (fragment) {
            is NavigationInterface -> {
                fragment.onBackPressed()
            }
            else -> { super.onBackPressed() }
        }
    }
}
