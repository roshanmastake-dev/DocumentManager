package com.roshan.documentmanager.ui.components

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

@Composable
fun DeleteConfirmationDialog(

    show: Boolean,

    title: String,

    onDelete: () -> Unit,

    onDismiss: () -> Unit

) {

    if (show) {

        AlertDialog(

            onDismissRequest = onDismiss,

            title = {

                Text("Delete")

            },

            text = {

                Text(

                    "Delete \"$title\" ?"

                )

            },

            confirmButton = {

                Button(

                    onClick = onDelete

                ) {

                    Text("Delete")

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

}
