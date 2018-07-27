package com.example.appstores.sources.stores.entries.models

import com.example.appstores.sources.stores.authors.models.Author
import com.example.appstores.sources.stores.categories.models.Category
import java.util.*

/**
 * Created by ahmedsaad on 2018-07-26.
 */
interface EntryType {
    var id: Int
    var name: String
    var thumbnails: ArrayList<Thumbnail>
    var summary: String
    var price: Double
    var currency: String
    var contentType: String
    var copyright: String
    var title: String
    var link: String
    var author: Author?
    var category: Category?
    var releaseDate: Date
}