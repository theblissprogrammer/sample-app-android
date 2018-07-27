package com.example.appstores.sources.stores.entries.models

import com.example.appstores.sources.stores.authors.models.Author
import com.example.appstores.sources.stores.authors.models.AuthorRealmObject
import com.example.appstores.sources.stores.categories.models.Category
import com.example.appstores.sources.stores.categories.models.CategoryRealmObject
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.Ignore
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Created by ahmedsaad on 2018-07-26.
 */
open class EntryRealmObject(
        @PrimaryKey
        override var id: Int = 0,
        override var name: String = "",
        var thumbnailsRaw: RealmList<ThumbnailRealmObject> = RealmList(),
        override var summary: String = "",
        override var price: Double = 0.0,
        override var currency: String = "",
        override var contentType: String = "",
        override var copyright: String = "",
        override var title: String = "",
        override var link: String = "",
        var authorRaw: AuthorRealmObject? = null,
        var categoryRaw: CategoryRealmObject? = null,
        override var releaseDate: Date = Date(0)): RealmObject(), EntryType {

    @Ignore
    override var author: Author? = null
        get() = Author(authorRaw)
        set(value) {
            authorRaw = AuthorRealmObject(value)

            field = value
        }

    @Ignore
    override var category: Category? = null
        get() = Category(categoryRaw)
        set(value) {
            categoryRaw = CategoryRealmObject(value)

            field = value
        }

    @Ignore
    override var thumbnails: ArrayList<Thumbnail> = arrayListOf()
        get() = ArrayList(thumbnailsRaw.map { Thumbnail(it) })
        set(value) {
            val realmList = RealmList<ThumbnailRealmObject>()
            realmList.addAll(value.toRealmList())

            thumbnailsRaw = realmList
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