package com.roshan.documentmanager.ui.screen.document

sealed interface DocumentAction {

    data object Open : DocumentAction

    data object Share : DocumentAction

    data object Print : DocumentAction

    data object Rename : DocumentAction

    data object Favorite : DocumentAction

    data object Delete : DocumentAction

}
