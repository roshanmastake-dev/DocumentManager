package com.roshan.documentmanager.share

import android.content.Intent
import android.net.Uri

object ShareIntentHandler {

    fun extractUris(intent: Intent?): List<Uri> {

        if (intent == null) return emptyList()

        return when (intent.action) {

            Intent.ACTION_SEND -> {

                val uri = intent.getParcelableExtra<Uri>(Intent.EXTRA_STREAM)

                if (uri != null) listOf(uri) else emptyList()

            }

            Intent.ACTION_SEND_MULTIPLE -> {

                intent.getParcelableArrayListExtra(Intent.EXTRA_STREAM)

                    ?: emptyList()

            }

            else -> emptyList()

        }

    }

}
