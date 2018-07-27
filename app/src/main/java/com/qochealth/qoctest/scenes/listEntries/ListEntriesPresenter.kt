package com.qochealth.qoctest.scenes.listEntries

import com.example.appstores.sources.stores.entries.models.EntryType
import com.example.coreandroid.sources.errors.DataError
import com.example.coreandroid.sources.logging.LogHelper
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.cleanBase.AppModels
import com.qochealth.qoctest.common.extensions.getString
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesDisplayable
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesModels
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesPresentable
import java.lang.ref.WeakReference

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class ListEntriesPresenter(private val fragment: WeakReference<ListEntriesDisplayable?>): ListEntriesPresentable {

    override fun presentFetchedEntries(response: ListEntriesModels.Response) {
        val viewModel = ListEntriesModels.ViewModel(
                entries = response.entries.map { make(it) }
        )

        fragment.get()?.displayFetchedEntries(viewModel)
    }

    override fun presentFetchedEntries(error: DataError) {
        // Handle and parse error
        val viewModel = AppModels.Error(
                title = getString(R.string.entry_error_title),
                message = error.localizedMessage
        )

        fragment.get()?.display(error = viewModel)
    }

    private fun make(from: EntryType): ListEntriesModels.EntryViewModel {
        return ListEntriesModels.EntryViewModel(
                id = from.id,
                title = from.title,
                imageURL = from.thumbnails.firstOrNull { it.height == 75 }?.link
        )
    }

}