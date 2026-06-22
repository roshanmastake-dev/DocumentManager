package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

@Composable
fun FolderCard(

    title: String,

    count: Int,

    onClick: () -> Unit

) {

    ElevatedCard(

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 6.dp)

            .clickable {

                onClick()

            }

    ) {

        Column(

            modifier = Modifier.padding(18.dp)

        ) {

            Text(

                text = "📁",

                style = MaterialTheme.typography.headlineMedium

            )

            Spacer(

                modifier = Modifier.height(8.dp)

            )

            Text(

                text = title,

                style = MaterialTheme.typography.titleMedium

            )

            Text(

                text = "$count Documents"

            )

        }

    }

}
