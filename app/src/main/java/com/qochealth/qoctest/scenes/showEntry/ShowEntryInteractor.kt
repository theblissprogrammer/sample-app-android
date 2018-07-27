package com.qochealth.qoctest.scenes.showEntry

import com.example.appstores.sources.stores.entries.EntriesWorkerType
import com.example.coreandroid.sources.errors.DataError
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryBusinessLogic
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryModels
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryPresentable

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class ShowEntryInteractor(private val presenter: ShowEntryPresentable,
                          val entriesWorker: EntriesWorkerType): ShowEntryBusinessLogic {

    override fun fetchEntry(request: ShowEntryModels.Request) {
        entriesWorker.fetch(request.entryID) {
            val entry = it.value
            if (entry == null || !it.isSuccess) {
                this.presenter.presentFetchedEntry(error = it.error ?: DataError.UnknownReason(null))
                return@fetch
            }

            this.presenter.presentFetchedEntry(
                    ShowEntryModels.Response(entry = entry)
            )
        }
    }
}