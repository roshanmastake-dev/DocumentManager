package com.roshan.documentmanager.ui.screen.category

import com.roshan.documentmanager.data.local.entity.CategoryEntity
import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class CategoryDetailUiState(

    val loading: Boolean = false,

    val category: CategoryEntity? = null,

    val childCategories: List<CategoryEntity> = emptyList(),

    val documents: List<DocumentEntity> = emptyList(),

    val error: String? = null

)
