package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

object DocumentSearchEngine {

    fun search(

        documents: List<DocumentEntity>,

        query: String

    ): List<DocumentEntity> {

        if (

            query.isBlank()

        ) {

            return documents

        }

        return documents.filter {

            it.displayName.contains(

                query,

                ignoreCase = true

            )

        }

    }

    fun searchByMimeType(

        documents: List<DocumentEntity>,

        mimeType: String

    ): List<DocumentEntity> {

        return documents.filter {

            it.mimeType == mimeType

        }

    }

    fun searchFavorite(

        documents: List<DocumentEntity>

    ): List<DocumentEntity> {

        return documents.filter {

            it.favorite

        }

    }

}
