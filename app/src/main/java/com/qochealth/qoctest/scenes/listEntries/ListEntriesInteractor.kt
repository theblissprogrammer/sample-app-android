package com.qochealth.qoctest.scenes.listEntries

import com.example.appstores.sources.stores.entries.EntriesWorkerType
import com.example.coreandroid.sources.errors.DataError
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesBusinessLogic
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesModels
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesPresentable

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class ListEntriesInteractor(private val presenter: ListEntriesPresentable,
                            val entriesWorker: EntriesWorkerType): ListEntriesBusinessLogic {

    override fun fetchEntries() {
        val entries = entriesWorker.fetch {
            val entries = it.value
            if (entries == null || !it.isSuccess) {
                this.presenter.presentFetchedEntries(error = it.error ?: DataError.UnknownReason(null))
                return@fetch
            }

            this.presenter.presentFetchedEntries(
                    ListEntriesModels.Response(entries = entries)
            )
        }
    }
}