package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.utils.FileIconResolver
import com.roshan.documentmanager.utils.FileSizeFormatter

@Composable
fun DocumentItem(

    document: DocumentEntity,

    onClick: () -> Unit

) {

    ElevatedCard(

        modifier = Modifier
            .fillMaxWidth()
            .clickable {

                onClick()

            }

    ) {

        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),

            verticalAlignment = Alignment.CenterVertically

        ) {

            Icon(

                imageVector = FileIconResolver.getIcon(
                    document.mimeType
                ),

                contentDescription = null

            )

            Spacer(

                modifier = Modifier.width(12.dp)

            )

            Column(

                modifier = Modifier.weight(1f)

            ) {

                Text(

                    text = document.displayName,

                    style = MaterialTheme.typography.titleMedium

                )

                Text(

                    text = FileSizeFormatter.format(
                        document.size
                    )

                )

            }

            if (document.favorite) {

                Icon(

                    imageVector = Icons.Outlined.Star,

                    contentDescription = null

                )

            }

        }

    }

}
