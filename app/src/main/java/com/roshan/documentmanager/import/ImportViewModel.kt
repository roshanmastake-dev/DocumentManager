package com.roshan.documentmanager.import

import android.net.Uri
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ImportViewModel : ViewModel() {

    private val _state = MutableStateFlow(

        ImportState()

    )

    val state: StateFlow<ImportState>

        get() = _state.asStateFlow()

    fun updateFiles(

        list: List<Uri>

    ) {

        _state.value = _state.value.copy(

            selectedFiles = list

        )

    }

    fun updateCategory(

        id: Long

    ) {

        _state.value = _state.value.copy(

            selectedCategoryId = id

        )

    }

}
