package com.roshan.documentmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.roshan.documentmanager.navigation.AppNavGraph
import com.roshan.documentmanager.ui.screen.backup.BackupScreen
import com.roshan.documentmanager.ui.screen.category.CategoryDetailScreen
import com.roshan.documentmanager.ui.screen.category.CategoryDetailUiState
import com.roshan.documentmanager.ui.screen.document.DocumentDetailScreen
import com.roshan.documentmanager.ui.screen.document.DocumentDetailUiState
import com.roshan.documentmanager.ui.screen.home.HomeScreen
import com.roshan.documentmanager.ui.screen.settings.SettingsScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {

        super.onCreate(savedInstanceState)

        setContent {

            val navController =
                rememberNavController()

            AppNavGraph(

                navController = navController,

                homeScreen = {

                    HomeScreen()

                },

                categoryScreen = {

                    CategoryDetailScreen(

                        state = CategoryDetailUiState(),

                        onCategoryClick = {},

                        onDocumentClick = {},

                        onAddClick = {}

                    )

                },

                documentScreen = {

                    DocumentDetailScreen(

                        state = DocumentDetailUiState(),

                        onRename = {},

                        onShare = {},

                        onPrint = {},

                        onDelete = {}

                    )

                },

                settingsScreen = {

                    SettingsScreen(

                        onBackupClick = {},

                        onPrivacyClick = {},

                        onAboutClick = {}

                    )

                },

                backupScreen = {

                    BackupScreen(

                        loading = false,

                        onBackupClick = {},

                        onRestoreClick = {}

                    )

                }

            )

        }

    }

}
