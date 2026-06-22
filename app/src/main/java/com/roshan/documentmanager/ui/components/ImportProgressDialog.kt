package com.roshan.documentmanager.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun ImportProgressDialog(

    progress: Float

) {

    AlertDialog(

        onDismissRequest = {},

        title = {

            Text("Importing")

        },

        text = {

            LinearProgressIndicator(

                progress = {

                    progress

                }

            )

        },

        confirmButton = {}

    )

}
