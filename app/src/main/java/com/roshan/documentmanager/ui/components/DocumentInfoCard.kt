package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.utils.DateFormatter
import com.roshan.documentmanager.utils.FileSizeFormatter

@Composable
fun DocumentInfoCard(

    document: DocumentEntity,

    onClick: () -> Unit

) {

    Card(

        modifier = Modifier
            .fillMaxWidth()
            .clickable {

                onClick()

            }

    ) {

        Column(

            modifier = Modifier.padding(16.dp)

        ) {

            Text(

                text = document.displayName,

                style = MaterialTheme.typography.titleMedium

            )

            Spacer(

                modifier = Modifier.height(4.dp)

            )

            Text(

                text = FileSizeFormatter.format(
                    document.size
                )

            )

            Text(

                text = DateFormatter.format(
                    document.createdAt
                )

            )

        }

    }

}
