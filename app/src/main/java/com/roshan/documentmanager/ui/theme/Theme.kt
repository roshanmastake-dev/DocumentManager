package com.roshan.documentmanager.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(

    primary = Primary,

    secondary = Secondary,

    background = Background,

    surface = Surface

)

@Composable
fun DocumentManagerTheme(

    content: @Composable () -> Unit

) {

    MaterialTheme(

        colorScheme = LightColors,

        typography = AppTypography,

        content = content

    )

}
