package com.roshan.documentmanager.ui.screen.search

import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class SearchUiState(

    val query: String = "",

    val loading: Boolean = false,

    val documents: List<DocumentEntity> = emptyList(),

    val filteredDocuments: List<DocumentEntity> = emptyList(),

    val error: String? = null

)
