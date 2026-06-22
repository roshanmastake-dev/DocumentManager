package com.roshan.documentmanager.model

import android.net.Uri

data class PickedDocument(

    val uri: Uri,

    var name: String,

    val mimeType: String,

    val selected: Boolean = false

)
