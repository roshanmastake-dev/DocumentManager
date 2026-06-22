package com.roshan.documentmanager.import

import android.content.Context
import android.net.Uri

object FileImportManager {

    fun persistPermission(

        context: Context,

        uri: Uri

    ) {

        context.contentResolver.takePersistableUriPermission(

            uri,

            android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION

        )

    }

}
