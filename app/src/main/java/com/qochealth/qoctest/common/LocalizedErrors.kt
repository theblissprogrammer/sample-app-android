package com.qochealth.qoctest.common

import com.example.coreandroid.sources.errors.DataError
import com.example.coreandroid.sources.errors.FieldErrors
import com.qochealth.qoctest.R
import com.qochealth.qoctest.common.extensions.getString

/// Get the localized description for this error
fun DataError.localizedDescription(): String {
    return when(this) {
        is DataError.DuplicateFailure -> getString(R.string.duplicate_failure_error_message)
        is DataError.NonExistent -> getString(R.string.non_existent_error_message)
        is DataError.Unauthorized -> getString(R.string.unauthorized_error_message)
        is DataError.InComplete -> getString(R.string.generic_incomplete_form_error_message)
        is DataError.NoInternet -> getString(R.string.no_internet_error_message)
        is DataError.DatabaseFailure -> getString(R.string.database_failure_error_message)
        is DataError.CacheFailure -> getString(R.string.cache_failure_error_message)
        is DataError.ParseFailure -> getString(R.string.parse_failure_error_message)
        is DataError.NetworkFailure -> getString(R.string.network_failure_error_message)
        is DataError.UnknownReason -> getString(R.string.unknown_reason_error_message)
        is DataError.Other -> parse(this.errors)
    }
}

fun parse(fieldErrors: FieldErrors): String {
    if (fieldErrors.isEmpty()) {
        getString(R.string.unknown_reason_error_message)
    }

    return fieldErrors.toList().fold("") { acc, pair ->
        // Handle field-less errors labeled as `base`
        if (pair.first == "base") {
            var output = acc + pair.second.joinToString(separator = " ")
            if (!output.endsWith(suffix = ".")) {
                output += ". "
            }
            return output
        }

        val localizedKey = getString(R.string.field_prefix, pair.first)
        return acc + pair.second
                // Figure if complete sentences or partial sent back since not consistent, nor dependent on key
                .map { if (!it.endsWith(suffix = ".")) "$localizedKey $it. " else "$it " }
                .joinToString(separator = "")
    }
}