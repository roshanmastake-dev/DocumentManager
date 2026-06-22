package com.roshan.documentmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.roshan.documentmanager.navigation.AppNavigation
import com.roshan.documentmanager.ui.theme.DocumentManagerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            DocumentManagerTheme {

                AppNavigation()

            }

        }

    }

}
