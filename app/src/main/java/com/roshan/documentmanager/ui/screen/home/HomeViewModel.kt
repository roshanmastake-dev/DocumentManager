package com.roshan.documentmanager.ui.screen.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _uiState =

        MutableStateFlow(

            HomeUiState()

        )

    val uiState: StateFlow<HomeUiState>

        get() = _uiState

    fun updateState(

        state: HomeUiState

    ) {

        _uiState.value = state

    }

}
