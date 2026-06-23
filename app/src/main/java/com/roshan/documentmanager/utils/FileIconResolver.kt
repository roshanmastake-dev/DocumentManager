package com.roshan.documentmanager.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material.icons.outlined.Image
import androidx.compose.ui.graphics.vector.ImageVector

object FileIconResolver {

    fun getIcon(

        mimeType: String

    ): ImageVector {

        return when {

            mimeType.startsWith("image") -> {

                Icons.Outlined.Image

            }

            mimeType == "application/pdf" -> {

                Icons.Outlined.Description

            }

            else -> {

                Icons.Outlined.Folder

            }

        }

    }

}
