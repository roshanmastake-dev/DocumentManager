package com.roshan.documentmanager.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class DocumentWithCategory(

    @Embedded
    val document: DocumentEntity,

    @Relation(
        parentColumn = "categoryId",
        entityColumn = "id"
    )
    val category: CategoryEntity

)
