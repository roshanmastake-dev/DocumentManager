package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

@Composable
fun FolderBreadcrumb(

    path: String

) {

    Text(

        text = path,

        style = MaterialTheme.typography.bodyMedium

    )

}
