package com.roshan.documentmanager.import

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable

@Composable
fun rememberDocumentPicker(

    onResult: (List<Uri>) -> Unit

): () -> Unit {

    val launcher = rememberLauncherForActivityResult(

        contract = ActivityResultContracts.OpenMultipleDocuments()

    ) { result ->

        if (result.isNotEmpty()) {

            onResult(result)

        }

    }

    return {

        launcher.launch(

            arrayOf(

                "image/*",

                "application/pdf"

            )

        )

    }

}
