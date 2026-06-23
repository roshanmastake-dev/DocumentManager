package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CategoryHeaderCard(

    title: String,

    documentCount: Int,

    folderCount: Int

) {

    Card(

        modifier = Modifier.fillMaxWidth()

    ) {

        Column(

            modifier = Modifier.padding(

                16.dp

            )

        ) {

            Icon(

                imageVector = Icons.Outlined.Folder,

                contentDescription = null

            )

            Spacer(

                modifier = Modifier.height(

                    8.dp

                )

            )

            Text(

                text = title,

                style = MaterialTheme.typography.titleLarge

            )

            Spacer(

                modifier = Modifier.height(

                    4.dp

                )

            )

            Text(

                text = "$folderCount Folders"

            )

            Text(

                text = "$documentCount Documents"

            )

        }

    }

}
