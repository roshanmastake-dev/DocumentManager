package com.roshan.documentmanager.backup

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BackupViewModel : ViewModel() {

    private val _state =

        MutableStateFlow(

            BackupState()

        )

    val state: StateFlow<BackupState>

        get() = _state

    fun startBackup() {

        _state.value =

            BackupState(

                loading = true

            )

    }

    fun finish(

        message: String

    ) {

        _state.value =

            BackupState(

                success = true,

                message = message

            )

    }

}
