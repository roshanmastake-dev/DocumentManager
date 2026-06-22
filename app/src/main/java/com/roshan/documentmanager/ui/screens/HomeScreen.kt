package com.roshan.documentmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.documentmanager.ui.components.CategoryCard
import com.roshan.documentmanager.ui.components.SearchBar

@Composable
fun HomeScreen() {

    Scaffold(

        floatingActionButton = {

            FloatingActionButton(

                onClick = {}

            ) {

                Text("+")

            }

        }

    ) { padding ->

        Column(

            modifier = Modifier

                .padding(padding)

                .padding(16.dp)

        ) {

            SearchBar()

            Spacer(modifier = Modifier.height(20.dp))

            Text(

                text = "Categories",

                style = MaterialTheme.typography.titleLarge

            )

            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn {

                items(4) {

                    CategoryCard(

                        title = listOf(

                            "Personal",

                            "Education",

                            "Office",

                            "Bank"

                        )[it]

                    ) {

                    }

                }

            }

        }

    }

}
