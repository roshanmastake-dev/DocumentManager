package com.roshan.documentmanager.utils

import android.content.ContentResolver
import android.net.Uri

object DocumentDeleteHelper {

    fun delete(

        resolver: ContentResolver,

        uri: Uri

    ): Boolean {

        return try {

            resolver.delete(

                uri,

                null,

                null

            )

            true

        } catch (

            exception: Exception

        ) {

            false

        }

    }

}
