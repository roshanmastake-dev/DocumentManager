package com.roshan.documentmanager.utils

object FileIcon {

    fun fromMimeType(

        mimeType: String

    ): String {

        return when {

            mimeType.startsWith("image") -> "🖼"

            mimeType.contains("pdf") -> "📄"

            else -> "📁"

        }

    }

}
