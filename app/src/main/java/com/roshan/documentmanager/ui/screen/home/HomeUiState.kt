package com.roshan.documentmanager.ui.screen.home

import com.roshan.documentmanager.data.local.entity.CategoryEntity
import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class HomeUiState(

    val loading: Boolean = false,

    val categories: List<CategoryEntity> = emptyList(),

    val recentDocuments: List<DocumentEntity> = emptyList(),

    val favoriteDocuments: List<DocumentEntity> = emptyList(),

    val searchQuery: String = "",

    val error: String? = null

)
