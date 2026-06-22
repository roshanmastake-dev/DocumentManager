package com.roshan.documentmanager.import

import android.content.Context
import android.net.Uri
import android.provider.OpenableColumns

object FileInfoResolver {

    fun getName(

        context: Context,

        uri: Uri

    ): String {

        val cursor = context.contentResolver.query(

            uri,

            null,

            null,

            null,

            null

        )

        cursor?.use {

            if (it.moveToFirst()) {

                val index = it.getColumnIndex(

                    OpenableColumns.DISPLAY_NAME

                )

                if (index >= 0) {

                    return it.getString(index)

                }

            }

        }

        return "Document"

    }

}
