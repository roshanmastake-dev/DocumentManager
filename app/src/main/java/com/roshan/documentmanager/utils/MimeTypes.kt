package com.roshan.documentmanager.utils

object MimeTypes {

    val supported = arrayOf(

        "image/*",

        "application/pdf"

    )

    fun isImage(

        mime: String

    ): Boolean {

        return mime.startsWith("image")

    }

    fun isPdf(

        mime: String

    ): Boolean {

        return mime == "application/pdf"

    }

}
