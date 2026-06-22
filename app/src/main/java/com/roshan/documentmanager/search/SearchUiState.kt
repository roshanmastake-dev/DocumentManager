package com.roshan.documentmanager.search

import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class SearchUiState(

    val query: String = "",

    val documents: List<DocumentEntity> = emptyList(),

    val loading: Boolean = false

)
