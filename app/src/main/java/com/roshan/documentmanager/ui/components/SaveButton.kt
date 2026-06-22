package com.roshan.documentmanager.ui.components

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

@Composable
fun SaveButton(

    onClick: () -> Unit

) {

    Button(

        onClick = onClick

    ) {

        Text("Save")

    }

}
