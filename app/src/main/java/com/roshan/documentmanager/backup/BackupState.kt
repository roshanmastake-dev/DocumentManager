package com.roshan.documentmanager.backup

data class BackupState(

    val loading: Boolean = false,

    val success: Boolean = false,

    val message: String = ""

)
