package com.roshan.documentmanager.ui.state

import com.roshan.documentmanager.data.local.entity.CategoryEntity

data class CategoryUiState(

    val loading: Boolean = false,

    val list: List<CategoryEntity> = emptyList(),

    val selectedCategoryId: Long? = null

)
