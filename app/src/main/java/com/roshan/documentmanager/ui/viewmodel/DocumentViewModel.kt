package com.roshan.documentmanager.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.data.repository.DocumentRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DocumentViewModel(

    private val repository: DocumentRepository

) : ViewModel() {

    private val _documents =

        MutableStateFlow<List<DocumentEntity>>(emptyList())

    val documents: StateFlow<List<DocumentEntity>>

        get() = _documents

    fun addDocument(

        document: DocumentEntity

    ) {

        viewModelScope.launch {

            repository.insert(document)

        }

    }

    fun deleteDocument(

        document: DocumentEntity

    ) {

        viewModelScope.launch {

            repository.delete(document)

        }

    }

}
