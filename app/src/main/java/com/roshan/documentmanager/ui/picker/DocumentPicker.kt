package com.roshan.documentmanager.ui.picker

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable

@Composable
fun rememberDocumentPicker(

    onFilesSelected: (List<Uri>) -> Unit

): () -> Unit {

    val launcher = rememberLauncherForActivityResult(

        contract = ActivityResultContracts.OpenMultipleDocuments()

    ) { uriList ->

        if (uriList.isNotEmpty()) {

            onFilesSelected(uriList)

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
