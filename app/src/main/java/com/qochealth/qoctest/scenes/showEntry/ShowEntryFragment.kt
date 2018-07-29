package com.qochealth.qoctest.scenes.showEntry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.appstores.sources.dependencies.HasDependencies
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.activities.BaseFragment
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryBusinessLogic
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryDisplayable
import com.qochealth.qoctest.scenes.showEntry.common.ShowEntryModels
import kotlinx.android.synthetic.main.content_show_entry.*
import kotlinx.android.synthetic.main.recycler_view_entry.view.*
import java.lang.ref.WeakReference

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class ShowEntryFragment: BaseFragment(), ShowEntryDisplayable, HasDependencies {
    companion object {
        const val ENTRYID = "ENTRY_ID"
    }

    // VIP variables
    private val interactor: ShowEntryBusinessLogic by lazy {
        ShowEntryInteractor(
                presenter = ShowEntryPresenter(WeakReference(this)),
                entriesWorker = dependencies.resolveEntriesWorker()
        )
    }

    // Internal variables
    var entryID: Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_show_entry, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configure()

        entryID = if (entryID == 0) {
            savedInstanceState?.getInt(ENTRYID, 0) ?: 0
        } else {
            entryID
        }

        loadData()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(ENTRYID, entryID)
    }

    private fun configure() {
        setHomeAsUp(true)
    }

    private fun loadData() {
        //showSpinner()

        interactor.fetchEntry(
                ShowEntryModels.Request(
                        entryID = entryID
                )
        )
    }

    override fun displayFetchedEntry(viewModel: ShowEntryModels.ViewModel) {
        val context = context ?: return

        setTitle(viewModel.name)
        setSubTitle(viewModel.category)

        Glide.with(context).load(viewModel.iconUrl)
                .apply(RequestOptions
                        .fitCenterTransform()
                        .placeholder(R.drawable.placeholder))
                .into(imageView)

        titleTextView.text = viewModel.title
        releaseDateTextView.text = viewModel.releaseDate
        summaryTextView.text = viewModel.summary
        priceTextView.text = viewModel.price
        categoryTextView.text = viewModel.category
        publisherTextView.text = viewModel.publisher
        appLinkTextView.text = viewModel.link
    }
}