package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddOptionsBottomSheet(

    onAddCategory: () -> Unit,

    onImportDocuments: () -> Unit

) {

    Column(

        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)

    ) {

        Text(

            text = "Create",

            style = MaterialTheme.typography.headlineSmall

        )

        Spacer(modifier = Modifier.height(20.dp))

        ElevatedCard(

            modifier = Modifier
                .fillMaxWidth()
                .clickable {

                    onAddCategory()

                }

        ) {

            Column(

                modifier = Modifier.padding(20.dp)

            ) {

                Text("📁 New Category")

                Text("Create Folder")

            }

        }

        Spacer(modifier = Modifier.height(12.dp))

        ElevatedCard(

            modifier = Modifier
                .fillMaxWidth()
                .clickable {

                    onImportDocuments()

                }

        ) {

            Column(

                modifier = Modifier.padding(20.dp)

            ) {

                Text("📄 Import Documents")

                Text("Images & PDF")

            }

        }

    }

}
