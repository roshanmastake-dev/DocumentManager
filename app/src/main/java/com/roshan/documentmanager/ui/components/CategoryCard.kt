package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CategoryCard(

    title: String,

    onClick: () -> Unit

) {

    Card(

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 6.dp)

            .clickable {

                onClick()

            }

    ) {

        Text(

            text = title,

            modifier = Modifier.padding(20.dp)

        )

    }

}
