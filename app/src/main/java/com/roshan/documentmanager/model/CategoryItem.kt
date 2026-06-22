package com.roshan.documentmanager.model

data class CategoryItem(

    val id: Long = 0,

    val name: String,

    val parentId: Long? = null,

    val totalDocuments: Int = 0

)
