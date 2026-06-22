package com.roshan.documentmanager.ui.state

import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class DocumentUiState(

    val loading: Boolean = false,

    val documents: List<DocumentEntity> = emptyList(),

    val search: String = "",

    val selectedCategoryId: Long? = null

)
