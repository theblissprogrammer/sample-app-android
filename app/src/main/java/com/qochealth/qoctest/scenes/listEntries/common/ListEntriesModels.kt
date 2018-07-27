package com.qochealth.qoctest.scenes.listEntries.common

import com.example.appstores.sources.stores.entries.models.EntryType

/**
 * Created by ahmedsaad on 2018-07-26.
 */
sealed class ListEntriesModels {

    class Response(
            val entries: List<EntryType>): ListEntriesModels()

    class ViewModel(
            val entries: List<EntryViewModel> = listOf()): ListEntriesModels()

    class EntryViewModel(
            val id: Int,
            val title: String,
            val imageURL: String?): ListEntriesModels()
}