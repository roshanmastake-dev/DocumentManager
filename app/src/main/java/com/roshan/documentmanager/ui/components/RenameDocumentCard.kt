package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier

@Composable
fun RenameDocumentCard(

    value: String,

    onValueChange: (String) -> Unit

) {

    var text by remember {

        mutableStateOf(value)

    }

    OutlinedTextField(

        value = text,

        onValueChange = {

            text = it

            onValueChange(it)

        },

        modifier = Modifier.fillMaxWidth(),

        singleLine = true,

        label = {

            Text("Document Name")

        }

    )

}
