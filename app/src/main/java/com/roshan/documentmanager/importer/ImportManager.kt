package com.roshan.documentmanager.importer

import android.content.Context
import android.net.Uri

object ImportManager {

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
