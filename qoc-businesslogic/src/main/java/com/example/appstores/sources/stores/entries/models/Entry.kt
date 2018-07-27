package com.example.appstores.sources.stores.entries.models

import com.example.appstores.sources.stores.authors.models.Author
import com.example.appstores.sources.stores.categories.models.Category
import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by ahmedsaad on 2018-07-26.
 */
data class Attributes(
        @SerializedName("im:id")
        var id: Int,
        @SerializedName("im:bundleId")
        var bundleId: String,
        var scheme: String,
        var rel: String,
        @SerializedName("href")
        var link: String,
        var label: String,
        var term: String,
        var amount: Double,
        var currency: String,
        var height: Int
)

data class SubSerializedNames(
        var label: String,
        var attributes: Attributes
)

data class Entry(
        @SerializedName("id")
        val idContainer: SubSerializedNames? = null,
        @SerializedName("im:name")
        val nameContainer: SubSerializedNames? = null,
        @SerializedName("im:image")
        override var thumbnails: ArrayList<Thumbnail> = arrayListOf(),
        @SerializedName("summary")
        val summaryContainer: SubSerializedNames? = null,
        @SerializedName("im:price")
        val priceContainer: SubSerializedNames? = null,
        @SerializedName("im:contentType")
        val contentContainer: SubSerializedNames? = null,
        @SerializedName("rights")
        val rightsContainer: SubSerializedNames? = null,
        @SerializedName("title")
        val titleContainer: SubSerializedNames? = null,
        @SerializedName("link")
        val linkContainer: SubSerializedNames? = null,
        @SerializedName("im:artist")
        override var author: Author? = null,
        override var category: Category? = null,
        @SerializedName("im:releaseDate")
        val releaseDateContainer: SubSerializedNames? = null): EntryType {

    @Transient
    override var id: Int = 0
        get() {
            return if (field == 0)
                idContainer?.attributes?.id ?: 0
            else
                field
        }
        set(value) {
            idContainer?.attributes?.id = value
            field = value
        }

    override var name: String = ""
        get() {
            return if (field == "")
                nameContainer?.label ?: ""
            else
                field
        }
        set(value) {
            nameContainer?.label = value
            field = value
        }

    @Transient
    override var summary: String = ""
        get() {
            return if (field == "")
                summaryContainer?.label ?: ""
            else
                field
        }
        set(value) {
            summaryContainer?.label = value
            field = value
        }

    override var price: Double = 0.0
        get() {
            return if (field == 0.0)
                priceContainer?.attributes?.amount ?: 0.0
            else
                field
        }
        set(value) {
            priceContainer?.attributes?.amount = value
            field = value
        }

    override var currency: String = ""
        get() {
            return if (field == "")
                priceContainer?.attributes?.currency ?: ""
            else
                field
        }
        set(value) {
            priceContainer?.attributes?.currency = value
            field = value
        }

    override var contentType: String = ""
        get() {
            return if (field == "")
                contentContainer?.attributes?.label ?: ""
            else
                field
        }
        set(value) {
            contentContainer?.attributes?.label = value
            field = value
        }

    override var copyright: String = ""
        get() {
            return if (field == "")
                rightsContainer?.label ?: ""
            else
                field
        }
        set(value) {
            rightsContainer?.label = value
            field = value
        }

    @Transient
    override var title: String = ""
        get() {
            return if (field == "")
                titleContainer?.label ?: ""
            else
                field
        }
        set(value) {
            titleContainer?.label = value
            field = value
        }

    @Transient
    override var link: String = ""
        get() {
            return if (field == "")
                linkContainer?.attributes?.link ?: ""
            else
                field
        }
        set(value) {
            linkContainer?.attributes?.link= value
            field = value
        }

    override var releaseDate: Date = Date(0)
        get() {
            return if (field == Date(0)) {
                val dateFormatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US)
                try {
                    dateFormatter.parse(releaseDateContainer?.label)
                } catch (e: Exception) {
                    Date(0)
                }
            } else
                field
        }
        set(value) {
            val dateFormatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US)
            releaseDateContainer?.label = dateFormatter.format(value)
            field = value
        }

    constructor(from: EntryType?) : this() {
        from?.let { entry ->
            this.id = entry.id
            this.name = entry.name
            this.thumbnails = entry.thumbnails
            this.summary = entry.summary
            this.price = entry.price
            this.currency = entry.currency
            this.contentType = entry.contentType
            this.copyright = entry.copyright
            this.title = entry.title
            this.link = entry.link
            this.author = entry.author
            this.category = entry.category
            this.releaseDate = entry.releaseDate
        }
    }
}

data class FeedsWrapper(
        val feed: FeedWrapper)

data class FeedWrapper(
        @SerializedName("entry")
        val entries: ArrayList<Entry>)