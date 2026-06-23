package com.roshan.documentmanager.utils

enum class FileMimeGroup {

    IMAGE,

    PDF,

    OTHER

}

object MimeGroupResolver {

    fun resolve(

        mime: String

    ): FileMimeGroup {

        return when {

            mime.startsWith(

                "image"

            ) -> FileMimeGroup.IMAGE

            mime ==

                    "application/pdf"

            -> FileMimeGroup.PDF

            else -> FileMimeGroup.OTHER

        }

    }

}
