package com.roshan.documentmanager.import

import android.net.Uri

data class ImportDocumentModel(

    val uri: Uri,

    val originalName: String,

    var displayName: String,

    val mimeType: String,

    val size: Long

)
