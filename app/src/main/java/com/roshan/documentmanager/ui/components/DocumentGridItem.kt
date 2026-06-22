package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

@Composable
fun DocumentGridItem(

    title: String,

    type: String,

    onClick: () -> Unit

) {

    ElevatedCard(

        modifier = Modifier

            .fillMaxWidth()

            .clickable {

                onClick()

            }

    ) {

        Column(

            modifier = Modifier

                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(

                text = "📄",

                style = MaterialTheme.typography.displaySmall

            )

            Spacer(

                modifier = Modifier.height(8.dp)

            )

            Text(

                text = title,

                maxLines = 1

            )

            Text(

                text = type,

                style = MaterialTheme.typography.bodySmall

            )

        }

    }

}
