package com.roshan.documentmanager.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AppTopBar() {

    CenterAlignedTopAppBar(

        title = {

            Text(

                text = "Document Manager"

            )

        }

    )

}
