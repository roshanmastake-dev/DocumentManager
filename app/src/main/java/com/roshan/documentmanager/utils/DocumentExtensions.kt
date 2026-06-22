package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

fun DocumentEntity.isPdf(): Boolean {

    return mimeType == "application/pdf"

}

fun DocumentEntity.isImage(): Boolean {

    return mimeType.startsWith(

        "image"

    )

}
