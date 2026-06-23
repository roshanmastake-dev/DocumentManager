package com.roshan.documentmanager.navigation

sealed class Screen(

    val route: String

) {

    data object Home : Screen(

        "home"

    )

    data object Category : Screen(

        "category/{categoryId}"

    ) {

        fun create(

            categoryId: Long

        ): String {

            return "category/$categoryId"

        }

    }

    data object Favorites : Screen(

        "favorites"

    )

    data object Search : Screen(

        "search"

    )

    data object Settings : Screen(

        "settings"

    )

}
