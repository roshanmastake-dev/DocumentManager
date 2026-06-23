package com.roshan.documentmanager.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SelectionTopBar(

    selectedCount: Int,

    onDelete: () -> Unit,

    onShare: () -> Unit,

    onClose: () -> Unit

) {

    TopAppBar(

        title = {

            Text(

                "$selectedCount Selected"

            )

        },

        navigationIcon = {

            IconButton(

                onClick = onClose

            ) {

                Text("✕")

            }

        },

        actions = {

            IconButton(

                onClick = onShare

            ) {

                Icon(

                    Icons.Outlined.Share,

                    null

                )

            }

            IconButton(

                onClick = onDelete

            ) {

                Icon(

                    Icons.Outlined.Delete,

                    null

                )

            }

        }

    )

}
