package com.roshan.documentmanager.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.ui.components.FolderCard

@Composable
fun HomeScreen(

    state: HomeUiState,

    onCategoryClick: (Long) -> Unit

) {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {

        Text(
            text = "Document Manager",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn {

            items(state.categories.size) { index ->

                val item = state.categories[index]

                FolderCard(
                    title = item.name,
                    count = item.documentCount,
                    onClick = {
                        onCategoryClick(item.id)
                    }
                )

                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
