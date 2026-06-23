package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DocumentActionCard(

    title: String,

    subtitle: String,

    onClick: () -> Unit

) {

    Card(

        modifier = Modifier
            .fillMaxWidth()
            .clickable {

                onClick()

            }

    ) {

        Column(

            modifier = Modifier.padding(16.dp)

        ) {

            Text(

                text = title,

                style = MaterialTheme.typography.titleMedium

            )

            Spacer(

                modifier = Modifier.height(4.dp)

            )

            Text(

                text = subtitle

            )

        }

    }

}
