package com.example.appstores.sources.stores.categories.models

import com.example.appstores.sources.stores.entries.models.Attributes

/**
 * Created by ahmedsaad on 2018-07-26.
 */
data class Category(
        val attributes: Attributes? = null): CategoryType {

    override var id: Int = 0
        get() {
            return if (field == 0)
                attributes?.id ?: 0
            else
                field
        }
        set(value) {
            attributes?.id = value
            field = value
        }

    override var name: String = ""
        get() {
            return if (field == "")
                attributes?.label ?: ""
            else
                field
        }
        set(value) {
            attributes?.label = value
            field = value
        }

    override var link: String = ""
        get() {
            return if (field == "")
                attributes?.scheme ?: ""
            else
                field
        }
        set(value) {
            attributes?.scheme = value
            field = value
        }

    constructor(from: CategoryType?): this() {
        from?.let { category ->
            this.id = category.id
            this.name = category.name
            this.link = category.link
        }
    }
}