package com.example.appstores.sources.stores.authors.models

import com.example.appstores.sources.stores.entries.models.Attributes
import com.google.gson.annotations.SerializedName

/**
 * Created by ahmedsaad on 2018-07-26.
 */
data class Author(
        @SerializedName("label")
        override var name: String = "",
        val attributes: Attributes? = null): AuthorType {

    override var link: String = ""
        get() {
            return if (field == "")
                attributes?.link ?: ""
            else
                field
        }
        set(value) {
            attributes?.link = value
            field = value
        }

    constructor(from: AuthorType?): this() {
        from?.let { author ->
            this.name = author.name
            this.link = author.link
        }
    }
}