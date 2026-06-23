package com.roshan.documentmanager.ui.screen.document

import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class DocumentDetailUiState(

    val loading: Boolean = false,

    val document: DocumentEntity? = null,

    val error: String? = null

)
