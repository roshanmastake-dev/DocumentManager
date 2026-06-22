package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

object SearchFilter {

    fun filter(

        list: List<DocumentEntity>,

        query: String

    ): List<DocumentEntity> {

        if (query.isBlank()) {

            return list

        }

        return list.filter {

            it.displayName.contains(

                query,

                ignoreCase = true

            )

        }

    }

}
