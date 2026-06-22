package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun EmptyCategoryView() {

    Box(

        modifier = Modifier.fillMaxSize(),

        contentAlignment = Alignment.Center

    ) {

        Column(

            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(

                text = "📁",

                style = MaterialTheme.typography.displayLarge

            )

            Spacer(

                modifier = Modifier.height(8.dp)

            )

            Text(

                text = "No Categories"

            )

            Text(

                text = "Tap + to create your first category."

            )

        }

    }

}
