package com.roshan.documentmanager.ui.screen.search

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.roshan.documentmanager.ui.components.DocumentItem

@Composable
fun SearchScreen(

    state: SearchUiState,

    onQueryChange: (String) -> Unit,

    onDocumentClick: (Long) -> Unit

) {

    Scaffold {

        LazyColumn(

            modifier = Modifier

                .fillMaxSize()

                .padding(it)

        ) {

            item {

                OutlinedTextField(

                    value = state.query,

                    onValueChange = onQueryChange,

                    modifier = Modifier.fillMaxSize(),

                    label = {

                        Text(

                            "Search Documents"

                        )

                    }

                )

            }

            items(

                state.filteredDocuments

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
