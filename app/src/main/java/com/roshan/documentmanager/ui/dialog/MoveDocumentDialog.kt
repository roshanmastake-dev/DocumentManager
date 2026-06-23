package com.roshan.documentmanager.ui.dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.ListItem
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.roshan.documentmanager.data.local.entity.CategoryEntity

@Composable
fun MoveDocumentDialog(

    categories: List<CategoryEntity>,

    onDismiss: () -> Unit,

    onMove: (Long) -> Unit

) {

    var selectedId by remember {

        mutableStateOf<Long?>(null)

    }

    AlertDialog(

        onDismissRequest = onDismiss,

        title = {

            Text("Move Document")

        },

        text = {

            LazyColumn(

                modifier = Modifier.fillMaxWidth()

            ) {

                items(

                    categories

                ) {

                    ListItem(

                        headlineContent = {

                            Text(

                                it.name

                            )

                        },

                        leadingContent = {

                            RadioButton(

                                selected = selectedId == it.id,

                                onClick = {

                                    selectedId = it.id

                                }

                            )

                        }

                    )

                }

            }

        },

        confirmButton = {

            TextButton(

                enabled = selectedId != null,

                onClick = {

                    selectedId?.let {

                        onMove(

                            it

                        )

                    }

                }

            ) {

                Text(

                    "Move"

                )

            }

        },

        dismissButton = {

            TextButton(

                onClick = onDismiss

            ) {

                Text(

                    "Cancel"

                )

            }

        }

    )

}
