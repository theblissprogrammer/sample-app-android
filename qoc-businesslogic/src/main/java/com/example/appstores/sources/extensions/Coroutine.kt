package com.example.appstores.sources.extensions

import com.example.coreandroid.sources.common.CompletionResponse
import com.example.coreandroid.sources.errors.DataError
import com.example.coreandroid.sources.errors.PaymentError
import com.example.coreandroid.sources.errors.ProfileError
import com.example.coreandroid.sources.logging.LogHelper
import io.realm.Realm
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.async

/**
 * Created by ahmedsaad on 2018-07-26.
 */
inline fun <T, reified E>realmCoroutine (
        crossinline call: (realm: Realm) -> CompletionResponse<T, E>): Deferred<CompletionResponse<T, E>> {
    return async(CommonPool) {
        var realm: Realm? = null

        try {
            realm = Realm.getDefaultInstance()
            call(realm)
        } catch (error: Exception) {
            LogHelper.e(messages = *arrayOf("Unhandled error occurred: ${error.localizedMessage}."))
            val e = when (E::class.java) {
                is DataError -> DataError.DatabaseFailure(error)
                is PaymentError -> PaymentError.DatabaseFailure(error)
                is ProfileError -> ProfileError.DatabaseFailure(error)
                else -> null
            }
            CompletionResponse.failure<T, E>(e as? E)
        } finally {
            realm?.close()
        }
    }
}