package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BreadcrumbBar(

    path: String

) {

    Text(

        text = path,

        modifier = Modifier.fillMaxWidth(),

        style = MaterialTheme.typography.bodyMedium

    )

}
