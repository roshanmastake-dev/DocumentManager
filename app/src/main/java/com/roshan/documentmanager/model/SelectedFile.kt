package com.roshan.documentmanager.model

import android.net.Uri

data class SelectedFile(

    val uri: Uri,

    var displayName: String,

    val mimeType: String

)
