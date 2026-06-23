package com.roshan.documentmanager.data.local.dao

import androidx.room.*
import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.data.local.entity.DocumentWithCategory
import kotlinx.coroutines.flow.Flow

@Dao
interface DocumentDao {

    @Transaction
    @Query(
        """
        SELECT *
        FROM documents
        ORDER BY createdAt DESC
        """
    )
    fun getAllDocuments(): Flow<List<DocumentWithCategory>>

    @Query(
        """
        SELECT *
        FROM documents
        WHERE categoryId = :categoryId
        ORDER BY displayName ASC
        """
    )
    fun getDocumentsByCategory(
        categoryId: Long
    ): Flow<List<DocumentEntity>>

    @Query(
        """
        SELECT *
        FROM documents
        WHERE favorite = 1
        ORDER BY createdAt DESC
        """
    )
    fun getFavoriteDocuments(): Flow<List<DocumentEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(
        document: DocumentEntity
    ): Long

    @Update
    suspend fun update(
        document: DocumentEntity
    )

    @Delete
    suspend fun delete(
        document: DocumentEntity
    )

    @Query(
        """
        DELETE FROM documents
        WHERE id = :id
        """
    )
    suspend fun deleteById(
        id: Long
    )
}

    @Delete
    suspend fun delete(
        document: DocumentEntity
    )

    @Query("""
        DELETE FROM documents
        WHERE id = :id
    """)
    suspend fun deleteById(
        id: Long
    )

}
