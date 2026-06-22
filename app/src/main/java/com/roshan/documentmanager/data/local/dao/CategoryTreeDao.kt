package com.roshan.documentmanager.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.roshan.documentmanager.data.local.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryTreeDao {

    @Query(
        "SELECT * FROM categories WHERE parentId IS NULL ORDER BY name ASC"
    )
    fun getRootCategories(): Flow<List<CategoryEntity>>

    @Query(
        "SELECT * FROM categories WHERE parentId=:parentId ORDER BY name ASC"
    )
    fun getChildren(
        parentId: Long
    ): Flow<List<CategoryEntity>>

}
