package com.roshan.documentmanager.storage

import android.content.Context
import android.net.Uri

object StorageManager {

    fun saveUri(

        context: Context,

        uri: Uri

    ): String {

        context.contentResolver.takePersistableUriPermission(

            uri,

            android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION

        )

        return uri.toString()

    }

}
