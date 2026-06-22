package com.roshan.documentmanager.ui.state

import com.roshan.documentmanager.model.PickedDocument

data class ImportUiState(

    val documents: List<PickedDocument> = emptyList(),

    val loading: Boolean = false,

    val selectedCategoryId: Long? = null

)
