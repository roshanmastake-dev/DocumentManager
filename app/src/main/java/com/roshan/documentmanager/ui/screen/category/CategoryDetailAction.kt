package com.roshan.documentmanager.ui.screen.category

sealed interface CategoryDetailAction {

    data object AddCategory : CategoryDetailAction

    data object AddDocument : CategoryDetailAction

    data object Rename : CategoryDetailAction

    data object Delete : CategoryDetailAction

    data object Search : CategoryDetailAction

    data object Sort : CategoryDetailAction

}
