package com.roshan.documentmanager.ui.screen.document

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DocumentDetailViewModel : ViewModel() {

    private val _state = MutableStateFlow(
        DocumentDetailUiState()
    )

    val state: StateFlow<DocumentDetailUiState>
        get() = _state

    fun setLoading() {

        _state.value = _state.value.copy(
            loading = true
        )

    }

    fun updateState(
        state: DocumentDetailUiState
    ) {

        _state.value = state

    }

}
