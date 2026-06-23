package com.roshan.documentmanager.utils

object FileTypeResolver {

    fun resolve(

        mimeType: String

    ): FileType {

        return when {

            mimeType.startsWith("image") -> {

                FileType.IMAGE

            }

            mimeType == "application/pdf" -> {

                FileType.PDF

            }

            else -> {

                FileType.UNKNOWN

            }

        }

    }

}
