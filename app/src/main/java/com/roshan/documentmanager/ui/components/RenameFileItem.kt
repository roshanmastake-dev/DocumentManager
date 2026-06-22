package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier

@Composable
fun RenameFileItem(

    fileName: String,

    onNameChange: (String) -> Unit

) {

    var value by remember {

        mutableStateOf(fileName)

    }

    OutlinedTextField(

        value = value,

        onValueChange = {

            value = it

            onNameChange(it)

        },

        modifier = Modifier.fillMaxWidth(),

        singleLine = true,

        label = {

            Text("Rename")

        }

    )

}
