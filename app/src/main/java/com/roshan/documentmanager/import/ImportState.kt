package com.roshan.documentmanager.import

import android.net.Uri

data class ImportState(

    val selectedFiles: List<Uri> = emptyList(),

    val selectedCategoryId: Long? = null,

    val loading: Boolean = false,

    val progress: Int = 0

)
