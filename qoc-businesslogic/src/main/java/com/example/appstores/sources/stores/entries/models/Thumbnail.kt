package com.example.appstores.sources.stores.entries.models

import com.google.gson.annotations.SerializedName

/**
 * Created by ahmedsaad on 2018-07-26.
 */
data class Thumbnail(
        @SerializedName("label")
        override var link: String = "",
        val attributes: Attributes? = null): ThumbnailType {

    override var height: Int = 0
        get() {
            return if (field == 0)
                attributes?.height ?: 0
            else
                field
        }
        set(value) {
            attributes?.height = value
            field = value
        }

    constructor(from: ThumbnailType?): this() {
        from?.let { thumbnail ->
            this.height = thumbnail.height
            this.link = thumbnail.link
        }
    }
}