package com.roshan.documentmanager.ui.components

import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FavoriteChip(

    favorite: Boolean

) {

    if (favorite) {

        AssistChip(

            onClick = {},

            label = {

                Text("★ Favorite")

            }

        )

    }

}
