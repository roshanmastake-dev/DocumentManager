package com.roshan.documentmanager.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roshan.documentmanager.data.repository.CategoryRepository
import com.roshan.documentmanager.data.repository.DocumentRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(

    private val categoryRepository: CategoryRepository,
    private val documentRepository: DocumentRepository

) : ViewModel() {

    private val _state = MutableStateFlow(HomeUiState())
    val state: StateFlow<HomeUiState> = _state

    init {
        loadHome()
    }

    private fun loadHome() {

        viewModelScope.launch {

            categoryRepository.getAllCategories().collect { categories ->

                val recent = documentRepository.getAllDocuments()

                _state.value = _state.value.copy(
                    categories = categories,
                    recentDocuments = emptyList() // temporary (next step me fix hoga)
                )

            }

        }

    }

}
