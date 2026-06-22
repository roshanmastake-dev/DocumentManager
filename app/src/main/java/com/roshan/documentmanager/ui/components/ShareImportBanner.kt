package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ShareImportBanner(

    count: Int

) {

    ElevatedCard(

        modifier = Modifier.fillMaxWidth()

    ) {

        Text(

            text = "$count file(s) received from another app.",

            modifier = Modifier.padding(16.dp)

        )

    }

}
