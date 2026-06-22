package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar() {

    var text by remember {

        mutableStateOf("")

    }

    OutlinedTextField(

        value = text,

        onValueChange = {

            text = it

        },

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(16.dp),

        label = {

            Text("Search documents")

        }

    )

}
