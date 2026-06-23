package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

object RecentDocumentManager {

    fun getRecent(

        list: List<DocumentEntity>,

        limit: Int = 10

    ): List<DocumentEntity> {

        return list

            .sortedByDescending {

                it.createdAt

            }

            .take(limit)

    }

}
