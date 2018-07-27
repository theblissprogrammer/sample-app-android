package com.qochealth.qoctest.scenes.listEntries.common

import com.example.coreandroid.sources.errors.DataError
import com.qochealth.qoctest.common.cleanBase.AppDisplayable
import com.qochealth.qoctest.common.routers.AppRoutable

/**
 * Created by ahmedsaad on 2018-07-26.
 */
interface ListEntriesDisplayable: AppDisplayable {
    fun displayFetchedEntries(viewModel: ListEntriesModels.ViewModel)
}

interface ListEntriesBusinessLogic {
    fun fetchEntries()
}

interface ListEntriesPresentable {
    fun presentFetchedEntries(response: ListEntriesModels.Response)
    fun presentFetchedEntries(error: DataError)
}

interface ListEntriesRoutable: AppRoutable {
    fun showEntry(id: Int)
}

interface ListEntriesDelegate {
    fun show(position: Int)
}