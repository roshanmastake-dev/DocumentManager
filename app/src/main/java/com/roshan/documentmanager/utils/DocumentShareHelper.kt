package com.roshan.documentmanager.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

object DocumentShareHelper {

    fun share(

        context: Context,

        uri: Uri,

        mimeType: String

    ) {

        val intent = Intent(

            Intent.ACTION_SEND

        ).apply {

            type = mimeType

            putExtra(

                Intent.EXTRA_STREAM,

                uri

            )

            addFlags(

                Intent.FLAG_GRANT_READ_URI_PERMISSION

            )

        }

        context.startActivity(

            Intent.createChooser(

                intent,

                "Share Document"

            )

        )

    }

}
