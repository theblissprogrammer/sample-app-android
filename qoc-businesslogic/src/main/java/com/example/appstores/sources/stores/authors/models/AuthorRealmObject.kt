package com.example.appstores.sources.stores.authors.models

import io.realm.RealmObject
import io.realm.annotations.Index

/**
 * Created by ahmedsaad on 2018-07-26.
 */
open class AuthorRealmObject(
        @Index
        override var link: String = "",
        override var name: String = ""): RealmObject(), AuthorType {

    constructor(from: AuthorType?): this() {
        from?.let { author ->
            this.name = author.name
            this.link = author.link
        }
    }
}