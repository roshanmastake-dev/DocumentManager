package com.roshan.documentmanager.domain.model

data class DocumentModel(

    val id: Long = 0,

    val name: String,

    val uri: String,

    val mimeType: String,

    val size: Long,

    val categoryId: Long,

    val favorite: Boolean = false,

    val createdAt: Long

)
