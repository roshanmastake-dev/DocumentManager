package com.roshan.documentmanager.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

object DocumentOpener {

    fun open(

        context: Context,

        uri: Uri,

        mimeType: String

    ) {

        val intent = Intent(

            Intent.ACTION_VIEW

        ).apply {

            setDataAndType(

                uri,

                mimeType

            )

            addFlags(

                Intent.FLAG_GRANT_READ_URI_PERMISSION

            )

        }

        context.startActivity(intent)

    }

}
