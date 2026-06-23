package com.roshan.documentmanager.ui.screen.document

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Print
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DocumentDetailScreen(

    state: DocumentDetailUiState,

    onRename: () -> Unit,

    onShare: () -> Unit,

    onPrint: () -> Unit,

    onDelete: () -> Unit

) {

    val document = state.document ?: return

    Scaffold {

        Column(

            modifier = Modifier

                .fillMaxSize()

                .padding(it)

                .padding(16.dp)

        ) {

            Text(

                text = document.displayName,

                style = MaterialTheme.typography.headlineSmall

            )

            Spacer(

                modifier = Modifier.height(8.dp)

            )

            Text(

                text = "Mime Type : ${document.mimeType}"

            )

            Text(

                text = "Size : ${document.size} bytes"

            )

            Spacer(

                modifier = Modifier.height(24.dp)

            )

            Button(

                modifier = Modifier.fillMaxWidth(),

                onClick = onRename

            ) {

                Icon(

                    Icons.Outlined.Edit,

                    null

                )

                Spacer(

                    Modifier.width(8.dp)

                )

                Text(

                    "Rename"

                )

            }

            Spacer(

                Modifier.height(8.dp)

            )

            Button(

                modifier = Modifier.fillMaxWidth(),

                onClick = onShare

            ) {

                Icon(

                    Icons.Outlined.Share,

                    null

                )

                Spacer(

                    Modifier.width(8.dp)

                )

                Text(

                    "Share"

                )

            }

            Spacer(

                Modifier.height(8.dp)

            )

            Button(

                modifier = Modifier.fillMaxWidth(),

                onClick = onPrint

            ) {

                Icon(

                    Icons.Outlined.Print,

                    null

                )

                Spacer(

                    Modifier.width(8.dp)

                )

                Text(

                    "Print"

                )

            }

            Spacer(

                Modifier.height(8.dp)

            )

            Button(

                modifier = Modifier.fillMaxWidth(),

                onClick = onDelete

            ) {

                Icon(

                    Icons.Outlined.Delete,

                    null

                )

                Spacer(

                    Modifier.width(8.dp)

                )

                Text(

                    "Delete"

                )

            }

        }

    }

}
