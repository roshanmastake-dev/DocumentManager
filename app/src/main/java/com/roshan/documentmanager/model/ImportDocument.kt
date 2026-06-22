package com.roshan.documentmanager.model

import android.net.Uri

data class ImportDocument(

    val id: Long = 0,

    val uri: Uri,

    var name: String,

    val mimeType: String,

    val size: Long,

    var selected: Boolean = true

)
