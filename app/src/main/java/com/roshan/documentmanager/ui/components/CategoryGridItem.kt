package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.data.local.entity.CategoryEntity

@Composable
fun CategoryGridItem(

    category: CategoryEntity,

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

            modifier = Modifier

                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Icon(

                imageVector = Icons.Outlined.Folder,

                contentDescription = null

            )

            Spacer(

                modifier = Modifier.height(

                    8.dp

                )

            )

            Text(

                text = category.name,

                style = MaterialTheme.typography.titleMedium

            )

        }

    }

}
