package com.roshan.documentmanager.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*

import androidx.compose.runtime.Composable

@Composable
fun AddButton(

    onClick: () -> Unit

) {

    FloatingActionButton(

        onClick = onClick

    ) {

        Icon(

            imageVector = Icons.Default.Add,

            contentDescription = "Add"

        )

    }

}
