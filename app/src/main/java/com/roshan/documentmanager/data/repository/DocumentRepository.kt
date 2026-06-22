package com.roshan.documentmanager.data.repository

import com.roshan.documentmanager.data.local.dao.DocumentDao
import com.roshan.documentmanager.data.local.entity.DocumentEntity
import kotlinx.coroutines.flow.Flow

class DocumentRepository(

    private val dao: DocumentDao

) {

    fun getDocuments(

        categoryId: Long

    ): Flow<List<DocumentEntity>> {

        return dao.getDocuments(categoryId)

    }

    suspend fun insert(

        document: DocumentEntity

    ) {

        dao.insert(document)

    }

    suspend fun update(

        document: DocumentEntity

    ) {

        dao.update(document)

    }

    suspend fun delete(

        document: DocumentEntity

    ) {

        dao.delete(document)

    }

}
