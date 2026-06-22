package com.roshan.documentmanager.domain.model

data class Category(

    val id: Long,

    val name: String,

    val parentId: Long?,

    val totalDocuments: Int

)
