package com.roshan.documentmanager.utils

import android.content.Context
import android.net.Uri
import android.provider.OpenableColumns

object FilePicker {

    fun getFileName(
        context: Context,
        uri: Uri
    ): String {

        var result = "Unknown"

        val cursor = context.contentResolver.query(
            uri,
            null,
            null,
            null,
            null
        )

        cursor?.use {

            if (it.moveToFirst()) {

                val index =
                    it.getColumnIndex(OpenableColumns.DISPLAY_NAME)

                if (index >= 0) {

                    result = it.getString(index)

                }

            }

        }

        return result

    }

}
