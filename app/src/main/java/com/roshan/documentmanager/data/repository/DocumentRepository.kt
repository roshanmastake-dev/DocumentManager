package com.roshan.documentmanager.data.repository

import com.roshan.documentmanager.data.local.dao.DocumentDao
import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.data.local.entity.DocumentWithCategory
import kotlinx.coroutines.flow.Flow

class DocumentRepository(

    private val dao: DocumentDao

) {

    fun getAllDocuments(): Flow<List<DocumentWithCategory>> {

        return dao.getAllDocuments()

    }

    fun getDocuments(

        categoryId: Long

    ): Flow<List<DocumentEntity>> {

        return dao.getDocumentsByCategory(categoryId)

    }

    fun getFavoriteDocuments(): Flow<List<DocumentEntity>> {

        return dao.getFavoriteDocuments()

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

    suspend fun deleteById(

        id: Long

    ) {

        dao.deleteById(id)

    }

}

        dao.update(document)

    }

    suspend fun delete(

        document: DocumentEntity

    ) {

        dao.delete(document)

    }

}
