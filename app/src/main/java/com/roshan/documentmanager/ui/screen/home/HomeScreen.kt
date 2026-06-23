package com.roshan.documentmanager.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.ui.components.DocumentItem

@Composable
fun HomeScreen(

    state: HomeUiState = HomeUiState(),

    onCategoryClick: (Long) -> Unit = {},

    onDocumentClick: (Long) -> Unit = {},

    onAddClick: () -> Unit = {}

) {

    Scaffold(

        floatingActionButton = {

            FloatingActionButton(

                onClick = onAddClick

            ) {

                Icon(

                    imageVector = Icons.Outlined.Add,

                    contentDescription = null

                )

            }

        }

    ) { padding ->

        LazyColumn(

            modifier = Modifier

                .fillMaxSize()

                .padding(padding)

                .padding(16.dp),

            verticalArrangement = Arrangement.spacedBy(12.dp)

        ) {

            item {

                Text(

                    text = "Document Manager",

                    style = MaterialTheme.typography.headlineMedium

                )

            }

            item {

                Text(

                    text = "Recent Documents",

                    style = MaterialTheme.typography.titleMedium

                )

            }

            items(

                state.recentDocuments

            ) { document ->

                DocumentItem(

                    document = document,

                    onClick = {

                        onDocumentClick(

                            document.id

                        )

                    }

                )

            }

        }

    }

}
