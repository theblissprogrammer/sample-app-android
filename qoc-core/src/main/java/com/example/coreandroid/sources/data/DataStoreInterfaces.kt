package com.example.coreandroid.sources.data

/**
 * Created by ahmedsaad on 2017-12-01.
 * Copyright © 2017. All rights reserved.
 */
interface DataStore {

    /// Name for isolated database per user or use anonymously
    val name: String
        get() = generateName(0)

    /// Used for referencing databases not associated with the current user
    fun generateName(userID: Int): String {
        return "user_$userID"
    }

    fun configure()
    fun delete(userID: Int)
}

interface DataWorkerType {
    fun delete(userID: Int)
    fun configure()
}