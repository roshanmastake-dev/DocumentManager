package com.roshan.documentmanager.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*

@Composable
fun RenameCategoryDialog(

    currentName: String,

    onDismiss: () -> Unit,

    onSave: (String) -> Unit

) {

    var value by remember {

        mutableStateOf(currentName)

    }

    AlertDialog(

        onDismissRequest = onDismiss,

        title = {

            Text("Rename Category")

        },

        text = {

            OutlinedTextField(

                value = value,

                onValueChange = {

                    value = it

                }

            )

        },

        confirmButton = {

            Button(

                onClick = {

                    onSave(value)

                }

            ) {

                Text("Save")

            }

        }

    )

}
