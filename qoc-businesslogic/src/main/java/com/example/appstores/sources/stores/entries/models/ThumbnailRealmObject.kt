package com.example.appstores.sources.stores.entries.models

import io.realm.RealmObject

/**
 * Created by ahmedsaad on 2018-07-26.
 */
open class ThumbnailRealmObject(
        override var height: Int = 0,
        override var link: String = ""): RealmObject(), ThumbnailType {

    constructor(from: ThumbnailType?): this() {
        from?.let { thumbnail ->
            this.height = thumbnail.height
            this.link = thumbnail.link
        }
    }
}

fun ArrayList<Thumbnail>.toRealmList(): List<ThumbnailRealmObject> {
    return this.map { ThumbnailRealmObject(it) }
}