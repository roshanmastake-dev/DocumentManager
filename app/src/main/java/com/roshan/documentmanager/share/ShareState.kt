package com.roshan.documentmanager.share

import android.net.Uri

data class ShareState(

    val files: List<Uri> = emptyList(),

    val loading: Boolean = false

)
