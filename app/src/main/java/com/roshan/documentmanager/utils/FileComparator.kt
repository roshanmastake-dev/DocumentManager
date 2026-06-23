package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

object FileComparator {

    fun isDuplicate(

        first: DocumentEntity,

        second: DocumentEntity

    ): Boolean {

        return first.displayName == second.displayName &&
                first.size == second.size &&
                first.mimeType == second.mimeType

    }

}
