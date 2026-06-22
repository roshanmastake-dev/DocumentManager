package com.roshan.documentmanager.utils

import android.content.Context
import android.net.Uri

object UriPermissionHelper {

    fun persist(

        context: Context,

        uri: Uri

    ) {

        context.contentResolver.takePersistableUriPermission(

            uri,

            android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION

        )

    }

}
