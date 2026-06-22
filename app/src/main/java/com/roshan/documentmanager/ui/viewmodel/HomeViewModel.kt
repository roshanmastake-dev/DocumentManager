package com.roshan.documentmanager.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roshan.documentmanager.data.local.entity.CategoryEntity
import com.roshan.documentmanager.data.repository.CategoryRepository
import com.roshan.documentmanager.ui.state.HomeUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: CategoryRepository
) : ViewModel() {

    private val _uiState =
        MutableStateFlow(HomeUiState())

    val uiState: StateFlow<HomeUiState> =
        _uiState.asStateFlow()

    fun updateSearch(text: String) {

        _uiState.value =
            _uiState.value.copy(
                searchText = text
            )

    }

    fun addCategory(name: String) {

        viewModelScope.launch {

            repository.insert(

                CategoryEntity(
                    name = name
                )

            )

        }

    }

}
