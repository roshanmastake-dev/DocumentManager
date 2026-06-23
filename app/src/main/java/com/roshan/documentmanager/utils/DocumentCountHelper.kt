package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

object DocumentCountHelper {

    fun imageCount(

        list: List<DocumentEntity>

    ): Int {

        return list.count {

            it.mimeType.startsWith(

                "image"

            )

        }

    }

    fun pdfCount(

        list: List<DocumentEntity>

    ): Int {

        return list.count {

            it.mimeType ==

                    "application/pdf"

        }

    }

}
