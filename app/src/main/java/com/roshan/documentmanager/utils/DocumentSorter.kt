package com.roshan.documentmanager.utils

import com.roshan.documentmanager.domain.model.DocumentModel

object DocumentSorter {

    fun sortByName(

        list: List<DocumentModel>

    ): List<DocumentModel> {

        return list.sortedBy {

            it.name.lowercase()

        }

    }

}
