package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BreadcrumbBar(

    path: List<String>

) {

    Row(

        modifier = androidx.compose.ui.Modifier

            .horizontalScroll(

                rememberScrollState()

            )

    ) {

        path.forEachIndexed { index, item ->

            Text(

                text = item,

                style = MaterialTheme.typography.bodyLarge

            )

            if (

                index != path.lastIndex

            ) {

                Text(" > ")

            }

        }

    }

}
