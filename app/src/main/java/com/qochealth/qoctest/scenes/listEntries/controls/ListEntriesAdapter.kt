package com.qochealth.qoctest.scenes.listEntries.controls

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qochealth.qoctest.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesDelegate
import com.qochealth.qoctest.scenes.listEntries.common.ListEntriesModels
import kotlinx.android.synthetic.main.recycler_view_entry.view.*
import java.lang.ref.WeakReference

/**
 * Created by ahmedsaad on 2018-07-26.
 */
open class ListEntriesAdapter(val delegate: WeakReference<ListEntriesDelegate?>? = null)
    : RecyclerView.Adapter<ListEntriesAdapter.EntryViewHolder>() {

    private var viewModel: ListEntriesModels.ViewModel = ListEntriesModels.ViewModel()

    class EntryViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun getItemCount() = viewModel.entries.size

    override fun onBindViewHolder(holder: EntryViewHolder, position: Int) {
        val model = viewModel.entries[position]
        holder.view.titleTextView.text = model.title

        Glide.with(holder.view.context).load(model.imageURL)
                .apply(RequestOptions
                        .fitCenterTransform()
                        .placeholder(R.drawable.placeholder))
                .into(holder.view.imageView)

        holder.view.setOnClickListener {
            delegate?.get()?.show(position)
        }
    }

    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_entry,
                parent, false)
        return EntryViewHolder(view)
    }

    fun reloadData(viewModel: ListEntriesModels.ViewModel) {
        this.viewModel = viewModel
        notifyDataSetChanged()
    }
}