package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

object DocumentFilter {

    fun images(

        list: List<DocumentEntity>

    ): List<DocumentEntity> {

        return list.filter {

            it.mimeType.startsWith("image")

        }

    }

    fun pdf(

        list: List<DocumentEntity>

    ): List<DocumentEntity> {

        return list.filter {

            it.mimeType == "application/pdf"

        }

    }

}
