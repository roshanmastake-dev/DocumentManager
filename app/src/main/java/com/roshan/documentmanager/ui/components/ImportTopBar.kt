package com.roshan.documentmanager.ui.components

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

@Composable
fun ImportTopBar(

    total: Int

) {

    CenterAlignedTopAppBar(

        title = {

            Text(

                "Import Documents ($total)"

            )

        }

    )

}
