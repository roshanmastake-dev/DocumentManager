package com.roshan.documentmanager.navigation

import androidx.navigation.NavHostController

class NavigationActions(

    private val navController: NavHostController

) {

    fun openHome() {

        navController.navigate(

            Screen.Home.route

        )

    }

    fun openCategory(

        id: Long

    ) {

        navController.navigate(

            "category/$id"

        )

    }

    fun openDocument(

        id: Long

    ) {

        navController.navigate(

            "document/$id"

        )

    }

    fun openSettings() {

        navController.navigate(

            Screen.Settings.route

        )

    }

    fun openBackup() {

        navController.navigate(

            "backup"

        )

    }

    fun back() {

        navController.popBackStack()

    }

}
