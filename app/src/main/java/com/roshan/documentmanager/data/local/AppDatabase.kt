package com.roshan.documentmanager.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.roshan.documentmanager.data.local.dao.CategoryDao
import com.roshan.documentmanager.data.local.dao.DocumentDao
import com.roshan.documentmanager.data.local.entity.CategoryEntity
import com.roshan.documentmanager.data.local.entity.DocumentEntity

@Database(

    entities = [

        CategoryEntity::class,

        DocumentEntity::class

    ],

    version = 1,

    exportSchema = false

)
abstract class AppDatabase : RoomDatabase() {

    abstract fun categoryDao(): CategoryDao

    abstract fun documentDao(): DocumentDao

}
