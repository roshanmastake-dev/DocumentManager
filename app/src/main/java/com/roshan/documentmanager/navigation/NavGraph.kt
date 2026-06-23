package com.roshan.documentmanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.roshan.documentmanager.ui.screen.backup.BackupScreen
import com.roshan.documentmanager.ui.screen.category.CategoryDetailScreen
import com.roshan.documentmanager.ui.screen.document.DocumentDetailScreen
import com.roshan.documentmanager.ui.screen.home.HomeScreen
import com.roshan.documentmanager.ui.screen.settings.SettingsScreen

@Composable
fun AppNavGraph(

    navController: NavHostController,

    homeScreen: @Composable () -> Unit,

    categoryScreen: @Composable () -> Unit,

    documentScreen: @Composable () -> Unit,

    settingsScreen: @Composable () -> Unit,

    backupScreen: @Composable () -> Unit

) {

    NavHost(

        navController = navController,

        startDestination = Screen.Home.route

    ) {

        composable(

            Screen.Home.route

        ) {

            homeScreen()

        }

        composable(

            Screen.Category.route

        ) {

            categoryScreen()

        }

        composable(

            Screen.Settings.route

        ) {

            settingsScreen()

        }

        composable(

            "document"

        ) {

            documentScreen()

        }

        composable(

            "backup"

        ) {

            backupScreen()

        }

    }

}
