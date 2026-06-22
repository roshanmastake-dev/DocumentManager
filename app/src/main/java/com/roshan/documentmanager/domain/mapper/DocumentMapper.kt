package com.roshan.documentmanager.domain.mapper

import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.domain.model.DocumentModel

fun DocumentEntity.toDomain(): DocumentModel {

    return DocumentModel(

        id = id,

        name = displayName,

        uri = uri,

        mimeType = mimeType,

        size = size,

        categoryId = categoryId,

        favorite = favorite,

        createdAt = createdAt

    )

}
