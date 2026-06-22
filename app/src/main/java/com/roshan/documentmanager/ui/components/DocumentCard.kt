package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DocumentCard(

    name: String,

    type: String,

    onClick: () -> Unit

) {

    Card(

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 6.dp)

            .clickable {

                onClick()

            }

    ) {

        Row(

            modifier = Modifier.padding(16.dp)

        ) {

            Icon(

                imageVector = Icons.Default.Description,

                contentDescription = null

            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {

                Text(

                    text = name,

                    style = MaterialTheme.typography.titleMedium

                )

                Text(

                    text = type,

                    style = MaterialTheme.typography.bodySmall

                )

            }

        }

    }

}
