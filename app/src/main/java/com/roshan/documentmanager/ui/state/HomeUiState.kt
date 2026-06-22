package com.roshan.documentmanager.ui.state

import com.roshan.documentmanager.data.local.entity.CategoryEntity

data class HomeUiState(

    val isLoading: Boolean = false,

    val categories: List<CategoryEntity> = emptyList(),

    val searchText: String = ""

)
