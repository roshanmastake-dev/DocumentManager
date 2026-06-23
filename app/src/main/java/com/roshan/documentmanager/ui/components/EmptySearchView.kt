package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.SearchOff
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun EmptySearchView() {

    Column(

        modifier = Modifier.fillMaxSize(),

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Icon(

            imageVector = Icons.Outlined.SearchOff,

            contentDescription = null

        )

        Text(

            text = "No Results Found",

            style = MaterialTheme.typography.titleMedium

        )

        Text(

            text = "Try another keyword"

        )

    }

}
