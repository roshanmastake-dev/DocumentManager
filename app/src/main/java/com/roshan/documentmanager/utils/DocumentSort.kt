package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

object DocumentSort {

    fun sort(

        list: List<DocumentEntity>,

        sortType: SortType

    ): List<DocumentEntity> {

        return when (sortType) {

            SortType.NAME_ASC ->

                list.sortedBy {

                    it.displayName.lowercase()

                }

            SortType.NAME_DESC ->

                list.sortedByDescending {

                    it.displayName.lowercase()

                }

            SortType.DATE_ASC ->

                list.sortedBy {

                    it.createdAt

                }

            SortType.DATE_DESC ->

                list.sortedByDescending {

                    it.createdAt

                }

            SortType.SIZE_ASC ->

                list.sortedBy {

                    it.size

                }

            SortType.SIZE_DESC ->

                list.sortedByDescending {

                    it.size

                }

        }

    }

}
