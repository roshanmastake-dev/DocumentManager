package com.roshan.documentmanager.ui.screen.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.ui.components.CategoryGridItem
import com.roshan.documentmanager.ui.components.CategoryHeaderCard
import com.roshan.documentmanager.ui.components.DocumentItem

@Composable
fun CategoryDetailScreen(

    state: CategoryDetailUiState,

    onCategoryClick: (Long) -> Unit,

    onDocumentClick: (Long) -> Unit,

    onAddClick: () -> Unit

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

        Column(

            modifier = Modifier

                .fillMaxSize()

                .padding(padding)

        ) {

            state.category?.let {

                CategoryHeaderCard(

                    title = it.name,

                    documentCount = state.documents.size,

                    folderCount = state.childCategories.size

                )

            }

            if (

                state.childCategories.isNotEmpty()

            ) {

                Text(

                    text = "Folders",

                    style = MaterialTheme.typography.titleMedium,

                    modifier = Modifier.padding(16.dp)

                )

                LazyVerticalGrid(

                    columns = GridCells.Fixed(2),

                    contentPadding = PaddingValues(8.dp),

                    horizontalArrangement = Arrangement.spacedBy(8.dp),

                    verticalArrangement = Arrangement.spacedBy(8.dp)

                ) {

                    items(

                        state.childCategories

                    ) { category ->

                        CategoryGridItem(

                            category = category,

                            onClick = {

                                onCategoryClick(

                                    category.id

                                )

                            }

                        )

                    }

                }

            }

            if (

                state.documents.isNotEmpty()

            ) {

                Text(

                    text = "Documents",

                    style = MaterialTheme.typography.titleMedium,

                    modifier = Modifier.padding(16.dp)

                )

                state.documents.forEach {

                    DocumentItem(

                        document = it,

                        onClick = {

                            onDocumentClick(

                                it.id

                            )

                        }

                    )

                }

            }

        }

    }

}
