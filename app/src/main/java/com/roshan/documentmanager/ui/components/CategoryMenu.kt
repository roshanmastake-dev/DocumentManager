package com.roshan.documentmanager.ui.components

import androidx.compose.material3.*

import androidx.compose.runtime.*

@Composable
fun CategoryMenu(

    onRename: () -> Unit,

    onDelete: () -> Unit

) {

    var expanded by remember {

        mutableStateOf(false)

    }

    IconButton(

        onClick = {

            expanded = true

        }

    ) {

        Text("⋮")

    }

    DropdownMenu(

        expanded = expanded,

        onDismissRequest = {

            expanded = false

        }

    ) {

        DropdownMenuItem(

            text = {

                Text("Rename")

            },

            onClick = {

                expanded = false

                onRename()

            }

        )

        DropdownMenuItem(

            text = {

                Text("Delete")

            },

            onClick = {

                expanded = false

                onDelete()

            }

        )

    }

}
