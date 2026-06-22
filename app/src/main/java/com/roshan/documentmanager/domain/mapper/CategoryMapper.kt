package com.roshan.documentmanager.domain.mapper

import com.roshan.documentmanager.data.local.entity.CategoryEntity
import com.roshan.documentmanager.domain.model.CategoryModel

fun CategoryEntity.toDomain(): CategoryModel {

    return CategoryModel(

        id = id,

        name = name,

        parentId = parentId

    )

}
