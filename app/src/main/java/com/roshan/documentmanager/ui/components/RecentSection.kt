package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.data.local.entity.DocumentEntity

@Composable
fun RecentSection(

    documents: List<DocumentEntity>,

    onClick: (DocumentEntity) -> Unit

) {

    Column {

        Text(

            text = "Recent",

            style = MaterialTheme.typography.titleLarge

        )

        Spacer(

            modifier = Modifier.height(

                12.dp

            )

        )

        documents.forEach {

            DocumentItem(

                document = it,

                onClick = {

                    onClick(it)

                }

            )

            Spacer(

                modifier = Modifier.height(

                    8.dp

                )

            )

        }

    }

}
