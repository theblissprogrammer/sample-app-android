package com.qochealth.qoctest.scenes.showEntry

import com.example.coreandroid.sources.errors.DataError
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.cleanBase.AppModels
import com.qochealth.qoctest.common.extensions.getString
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryDisplayable
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryModels
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryPresentable
import java.lang.ref.WeakReference
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class ShowEntryPresenter(private val fragment: WeakReference<ShowEntryDisplayable?>): ShowEntryPresentable{

    private val releaseDateFormatter = SimpleDateFormat("MM/dd/yyyy", Locale.US)

    override fun presentFetchedEntry(response: ShowEntryModels.Response) {
        val viewModel = ShowEntryModels.ViewModel(
                name = response.entry.name,
                title = response.entry.title,
                iconUrl = response.entry.thumbnails.firstOrNull { it.height == 100 }?.link ?: "",
                releaseDate = releaseDateFormatter.format(response.entry.releaseDate),
                summary = response.entry.summary,
                price = String.format(Locale.US, "%.2f %s", response.entry.price, response.entry.currency),
                category = response.entry.category?.name ?: "",
                link = response.entry.link,
                publisherName = response.entry.author?.name ?: "",
                publisherLink = response.entry.author?.link ?: ""
        )

        fragment.get()?.displayFetchedEntry(viewModel)
    }

    override fun presentFetchedEntry(error: DataError) {
        // Handle and parse error
        val viewModel = AppModels.Error(
                title = getString(R.string.entry_error_title),
                message = error.localizedMessage
        )

        fragment.get()?.display(error = viewModel)
    }
}