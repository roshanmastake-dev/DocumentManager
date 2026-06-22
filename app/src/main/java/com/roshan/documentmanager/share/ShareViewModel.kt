package com.roshan.documentmanager.share

import android.net.Uri
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ShareViewModel : ViewModel() {

    private val _sharedFiles =

        MutableStateFlow<List<Uri>>(emptyList())

    val sharedFiles: StateFlow<List<Uri>>

        get() = _sharedFiles

    fun update(

        files: List<Uri>

    ) {

        _sharedFiles.value = files

    }

}
