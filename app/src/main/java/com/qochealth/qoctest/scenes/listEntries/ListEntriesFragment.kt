package com.qochealth.qoctest.scenes.listEntries

import android.os.Bundle
import android.view.*
import com.example.appstores.sources.dependencies.HasDependencies
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.activities.BaseFragment
import com.qochealth.qoctest.scenes.listEntries.common.*
import com.qochealth.qoctest.scenes.listEntries.controls.ListEntriesAdapter
import java.lang.ref.WeakReference
import kotlinx.android.synthetic.main.fragment_list_entries.*

/**
 * Created by ahmedsaad on 2018-07-26.
 */
class ListEntriesFragment: BaseFragment(), ListEntriesDisplayable, HasDependencies, ListEntriesDelegate {

    // VIP variables
    private val interactor: ListEntriesBusinessLogic by lazy {
        ListEntriesInteractor(
                presenter = ListEntriesPresenter(WeakReference(this)),
                entriesWorker = dependencies.resolveEntriesWorker()
        )
    }

    private val router: ListEntriesRoutable by lazy {
        ListEntriesRouter(WeakReference(this))
    }


    val adapter by lazy {
        ListEntriesAdapter(delegate = WeakReference(this))
    }

    // View models
    private var entriesViewModel = ListEntriesModels.ViewModel()
        set(value) {
            field = value
            adapter.reloadData(value)
        }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list_entries, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configure()
        loadData()
    }

    private fun configure() {
        setHasOptionsMenu(true)
        setTitle(getString(R.string.list_entries_title))

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = this.adapter
    }

    private fun loadData() {
        showSpinner()

        interactor.fetchEntries()
    }

    override fun displayFetchedEntries(viewModel: ListEntriesModels.ViewModel) {
        if (viewModel.entries.isNotEmpty())
            hideSpinner()

        this.entriesViewModel = viewModel
    }

    override fun show(position: Int) {
        val entry = entriesViewModel.entries[position]

        router.showEntry(
                id = entry.id
        )
    }
}