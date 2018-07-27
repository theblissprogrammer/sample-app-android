package com.qochealth.qoctest.scenes.showEntry.common

import com.example.coreandroid.sources.errors.DataError
import com.qochealth.qoctest.common.cleanBase.AppDisplayable

/**
 * Created by ahmedsaad on 2018-07-26.
 */
interface ShowEntryDisplayable: AppDisplayable {
    fun displayFetchedEntry(viewModel: ShowEntryModels.ViewModel)
}

interface ShowEntryBusinessLogic {
    fun fetchEntry(request: ShowEntryModels.Request)
}

interface ShowEntryPresentable {
    fun presentFetchedEntry(response: ShowEntryModels.Response)
    fun presentFetchedEntry(error: DataError)
}