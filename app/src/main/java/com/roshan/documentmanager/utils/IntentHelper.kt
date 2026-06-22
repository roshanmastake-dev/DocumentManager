package com.roshan.documentmanager.utils

import android.content.Intent

object IntentHelper {

    fun createOpenIntent(): Intent {

        return Intent(

            Intent.ACTION_OPEN_DOCUMENT

        ).apply {

            type = "*/*"

            putExtra(

                Intent.EXTRA_ALLOW_MULTIPLE,

                true

            )

            addCategory(

                Intent.CATEGORY_OPENABLE

            )

        }

    }

}
