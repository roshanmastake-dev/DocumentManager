package com.roshan.documentmanager.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SearchBarView(

    value: String,

    onValueChange: (String) -> Unit

) {

    OutlinedTextField(

        value = value,

        onValueChange = onValueChange,

        modifier = Modifier.fillMaxWidth(),

        singleLine = true,

        placeholder = {

            Text("Search documents")

        }

    )

}
