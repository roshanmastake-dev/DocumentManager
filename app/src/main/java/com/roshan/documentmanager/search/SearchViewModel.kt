package com.roshan.documentmanager.search

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SearchViewModel : ViewModel() {

    private val _state = MutableStateFlow(
        SearchUiState()
    )

    val state: StateFlow<SearchUiState>
        get() = _state

    fun updateQuery(
        value: String
    ) {

        _state.value = _state.value.copy(
            query = value
        )

    }

}
