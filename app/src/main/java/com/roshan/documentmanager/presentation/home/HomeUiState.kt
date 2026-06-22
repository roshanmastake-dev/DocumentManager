package com.roshan.documentmanager.presentation.home

import com.roshan.documentmanager.data.local.entity.CategoryEntity
import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class HomeUiState(

    val loading: Boolean = false,

    val categories: List<CategoryEntity> = emptyList(),

    val recentDocuments: List<DocumentEntity> = emptyList(),

    val favoriteCount: Int = 0,

    val searchQuery: String = ""

)
