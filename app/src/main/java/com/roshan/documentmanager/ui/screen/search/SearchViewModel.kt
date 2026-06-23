package com.roshan.documentmanager.ui.screen.search

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SearchViewModel : ViewModel() {

    private val _uiState =

        MutableStateFlow(

            SearchUiState()

        )

    val uiState: StateFlow<SearchUiState>

        get() = _uiState

    fun updateQuery(

        query: String

    ) {

        _uiState.value =

            _uiState.value.copy(

                query = query

            )

    }

    fun updateDocuments(

        list: List<com.roshan.documentmanager.data.local.entity.DocumentEntity>

    ) {

        _uiState.value =

            _uiState.value.copy(

                documents = list,

                filteredDocuments = list

            )

    }

}
