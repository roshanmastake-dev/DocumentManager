package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier

@Composable
fun DocumentRenameCard(

    fileName: String,

    onRename: (String) -> Unit

) {

    var value by remember {

        mutableStateOf(fileName)

    }

    Card(

        modifier = Modifier.fillMaxWidth()

    ) {

        OutlinedTextField(

            value = value,

            onValueChange = {

                value = it

                onRename(it)

            },

            label = {

                Text("Document Name")

            }

        )

    }

}
