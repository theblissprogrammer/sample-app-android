package com.example.appstores.sources.stores.categories.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by ahmedsaad on 2018-07-26.
 */
open class CategoryRealmObject(
        @PrimaryKey
        override var id: Int = 0,
        override var name: String = "",
        override var link: String = ""): RealmObject(), CategoryType {

    constructor(from: CategoryType?): this() {
        from?.let { category ->
            this.id = category.id
            this.name = category.name
            this.link = category.link
        }
    }

}