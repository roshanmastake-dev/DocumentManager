package com.roshan.documentmanager.domain.model

data class CategoryModel(

    val id: Long = 0,

    val name: String,

    val parentId: Long?,

    val documentCount: Int = 0

)
