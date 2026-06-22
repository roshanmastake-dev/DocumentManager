package com.roshan.documentmanager.data.local.dao

import androidx.room.*
import com.roshan.documentmanager.data.local.entity.DocumentEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DocumentDao {

    @Query(
        "SELECT * FROM documents WHERE categoryId=:categoryId ORDER BY displayName ASC"
    )
    fun getDocuments(
        categoryId: Long
    ): Flow<List<DocumentEntity>>

    @Insert
    suspend fun insert(document: DocumentEntity)

    @Update
    suspend fun update(document: DocumentEntity)

    @Delete
    suspend fun delete(document: DocumentEntity)

}
