package com.example.coreandroid.sources.network

import android.net.Uri
import com.example.coreandroid.sources.common.CompletionResponse
import com.example.coreandroid.sources.common.CompletionResponse.Companion.failure
import com.example.coreandroid.sources.common.CompletionResponse.Companion.success
import com.example.coreandroid.sources.enums.NetworkMethod
import com.example.coreandroid.sources.errors.NetworkError
import okhttp3.*
import java.util.concurrent.TimeUnit

/**
 * Created by ahmedsaad on 2018-02-08.
 * Copyright © 2017. All rights reserved.
 */

data class ServerResponse (val data: String, val headers: Map<String, String>, val statusCode: Int)

interface HTTPServiceType {
    fun get(url: String, parameters: Map<String, Any?>? = null, headers: Map<String, String>? = null):
            CompletionResponse<ServerResponse, NetworkError>
}

class HTTPService: HTTPServiceType {
    private val sessionManager : OkHttpClient = OkHttpClient().newBuilder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS).build()

    override fun get(url: String, parameters: Map<String, Any?>?, headers: Map<String, String>?):
            CompletionResponse<ServerResponse, NetworkError> {
        val uri = Uri.parse(url)
                .buildUpon()

        try {
            parameters?.forEach { if (it.value != null) uri.appendQueryParameter(it.key, it.value.toString()) }
        } catch (error: Exception) {
            return failure(
                    NetworkError(
                            statusCode = 0,
                            internalError = error
                    )
            )
        }

        val urlRequest = Request.Builder()
                .url(uri.build().toString())
                .method(NetworkMethod.GET.name, null)

        headers?.forEach {
            urlRequest.addHeader(it.key, it.value)
        }

        val response = sessionManager.newCall(urlRequest.build()).execute()

        // Retrieve the data
        val data = response.body()?.string()
        // Convert header values to string dictionary
        val responseHeaders = response.headers().toMultimap().mapValues { it.value.first() }
        val statusCode = response.code()

        if (response.isSuccessful) {
            return success(
                    ServerResponse(
                            data = data ?: "",
                            headers = responseHeaders,
                            statusCode = statusCode
                    )
            )
        } else {
            val error = NetworkError(
                    urlRequest = null,
                    statusCode = statusCode,
                    headerValues = responseHeaders,
                    serverData = data ?: "")
            return failure(error)
        }
    }
}