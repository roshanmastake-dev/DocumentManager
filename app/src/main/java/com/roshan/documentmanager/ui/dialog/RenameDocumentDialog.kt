package com.roshan.documentmanager.ui.dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.roshan.documentmanager.utils.FileNameValidator

@Composable
fun RenameDocumentDialog(

    currentName: String,

    onDismiss: () -> Unit,

    onRename: (String) -> Unit

) {

    var value by remember {

        mutableStateOf(currentName)

    }

    val valid = remember(value) {

        FileNameValidator.isValid(value)

    }

    AlertDialog(

        onDismissRequest = onDismiss,

        title = {

            Text("Rename Document")

        },

        text = {

            OutlinedTextField(

                value = value,

                onValueChange = {

                    value = it

                },

                modifier = Modifier.fillMaxWidth(),

                singleLine = true

            )

        },

        confirmButton = {

            Button(

                enabled = valid,

                onClick = {

                    onRename(

                        FileNameValidator.sanitize(

                            value

                        )

                    )

                }

            ) {

                Text("Save")

            }

        },

        dismissButton = {

            TextButton(

                onClick = onDismiss

            ) {

                Text("Cancel")

            }

        }

    )

}
