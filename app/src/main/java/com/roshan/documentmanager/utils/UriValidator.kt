package com.roshan.documentmanager.utils

import android.content.Context
import android.net.Uri

object UriValidator {

    fun isValid(

        context: Context,

        uri: Uri

    ): Boolean {

        return try {

            context.contentResolver.openInputStream(uri)?.close()

            true

        } catch (

            exception: Exception

        ) {

            false

        }

    }

}
