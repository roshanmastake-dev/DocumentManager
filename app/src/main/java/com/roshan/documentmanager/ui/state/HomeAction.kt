package com.roshan.documentmanager.ui.state

sealed interface HomeAction {

    data object AddCategory : HomeAction

    data object AddDocument : HomeAction

    data object Search : HomeAction

    data object Settings : HomeAction

}
