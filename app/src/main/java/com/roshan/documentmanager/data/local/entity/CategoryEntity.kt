package com.roshan.documentmanager.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class CategoryEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val name: String,

    val parentId: Long? = null,

    val createdAt: Long = System.currentTimeMillis()

)
