package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun EmptyState(

    title: String,

    message: String

) {

    Column(

        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center

    ) {

        Text(

            text = "📁",

            style = MaterialTheme.typography.displayLarge

        )

        Spacer(

            modifier = Modifier.height(16.dp)

        )

        Text(

            text = title,

            style = MaterialTheme.typography.titleLarge

        )

        Text(

            text = message

        )

    }

}
