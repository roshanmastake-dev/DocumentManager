package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StorageInfoCard(

    totalFiles: Int,

    images: Int,

    pdf: Int,

    storage: String

) {

    Card(

        modifier = Modifier.fillMaxWidth()

    ) {

        Column(

            modifier = Modifier.padding(16.dp)

        ) {

            Text(

                "Storage",

                style = MaterialTheme.typography.titleMedium

            )

            Spacer(

                modifier = Modifier.height(12.dp)

            )

            Text(

                "Total Files : $totalFiles"

            )

            Text(

                "Images : $images"

            )

            Text(

                "PDF : $pdf"

            )

            Text(

                "Used : $storage"

            )

        }

    }

}
