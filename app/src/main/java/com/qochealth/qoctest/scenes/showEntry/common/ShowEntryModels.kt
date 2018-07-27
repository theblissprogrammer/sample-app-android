package com.qochealth.qoctest.scenes.showEntry.common

import com.example.appstores.sources.stores.entries.models.EntryType

/**
 * Created by ahmedsaad on 2018-07-26.
 */
sealed class ShowEntryModels {
    class Request(
            val entryID: Int): ShowEntryModels()

    class Response(
            val entry: EntryType): ShowEntryModels()

    class ViewModel(
            val name: String,
            val title: String,
            val iconUrl: String,
            val releaseDate: String,
            val summary: String,
            val price: String,
            val category: String,
            val link: String,
            val publisherName: String,
            val publisherLink: String): ShowEntryModels()
}