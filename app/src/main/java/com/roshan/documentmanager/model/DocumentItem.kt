package com.roshan.documentmanager.model

data class DocumentItem(

    val id: Long = 0,

    val name: String,

    val uri: String,

    val type: String,

    val size: Long,

    val categoryId: Long,

    val favorite: Boolean = false

)
