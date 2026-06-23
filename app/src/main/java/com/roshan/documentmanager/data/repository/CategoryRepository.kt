package com.roshan.documentmanager.data.repository

import com.roshan.documentmanager.data.local.dao.CategoryDao
import com.roshan.documentmanager.data.local.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

class CategoryRepository(

    private val dao: CategoryDao

) {

    fun getAllCategories(): Flow<List<CategoryEntity>> {

        return dao.getAllCategories()

    }

    fun getChildCategories(

        parentId: Long?

    ): Flow<List<CategoryEntity>> {

        return dao.getChildCategories(parentId)

    }

    suspend fun insert(

        category: CategoryEntity

    ): Long {

        return dao.insert(category)

    }

    suspend fun update(

        category: CategoryEntity

    ) {

        dao.update(category)

    }

    suspend fun delete(

        category: CategoryEntity

    ) {

        dao.delete(category)

    }

}
