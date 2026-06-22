package com.roshan.documentmanager.domain.model

data class Document(

    val id: Long,

    val name: String,

    val uri: String,

    val mimeType: String,

    val size: Long,

    val categoryId: Long,

    val favorite: Boolean,

    val createdAt: Long

)
