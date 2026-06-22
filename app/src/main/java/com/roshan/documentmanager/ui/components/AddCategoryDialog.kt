package com.roshan.documentmanager.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier

@Composable
fun AddCategoryDialog(

    showDialog: Boolean,

    onDismiss: () -> Unit,

    onSave: (String) -> Unit

) {

    var categoryName by remember {

        mutableStateOf("")

    }

    if (showDialog) {

        AlertDialog(

            onDismissRequest = onDismiss,

            title = {

                Text("New Category")

            },

            text = {

                OutlinedTextField(

                    value = categoryName,

                    onValueChange = {

                        categoryName = it

                    },

                    modifier = Modifier.fillMaxWidth(),

                    singleLine = true,

                    label = {

                        Text("Category Name")

                    }

                )

            },

            confirmButton = {

                Button(

                    onClick = {

                        if (categoryName.isNotBlank()) {

                            onSave(categoryName.trim())

                            categoryName = ""

                        }

                    }

                ) {

                    Text("Save")

                }

            },

            dismissButton = {

                TextButton(

                    onClick = onDismiss

                ) {

                    Text("Cancel")

                }

            }

        )

    }

}
