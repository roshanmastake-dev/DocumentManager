package com.roshan.documentmanager.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

@Composable
fun ImportFab(

    onClick: () -> Unit

) {

    ExtendedFloatingActionButton(

        onClick = onClick,

        icon = {

            Icon(

                imageVector = Icons.Default.Add,

                contentDescription = null

            )

        },

        text = {

            Text(

                "Import"

            )

        }

    )

}
