package com.roshan.documentmanager.ui.components

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

@Composable
fun DeleteConfirmDialog(

    title: String,

    onConfirm: () -> Unit,

    onDismiss: () -> Unit

) {

    AlertDialog(

        onDismissRequest = onDismiss,

        title = {

            Text(

                "Delete"

            )

        },

        text = {

            Text(

                "Delete \"$title\" ?"

            )

        },

        confirmButton = {

            Button(

                onClick = onConfirm

            ) {

                Text(

                    "Delete"

                )

            }

        },

        dismissButton = {

            OutlinedButton(

                onClick = onDismiss

            ) {

                Text(

                    "Cancel"

                )

            }

        }

    )

}
