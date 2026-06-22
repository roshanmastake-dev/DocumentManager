package com.roshan.documentmanager.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "documents")
data class DocumentEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val categoryId: Long,

    val displayName: String,

    val uri: String,

    val mimeType: String,

    val size: Long,

    val favorite: Boolean = false,

    val createdAt: Long = System.currentTimeMillis()

)
