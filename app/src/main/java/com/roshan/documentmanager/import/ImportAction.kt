package com.roshan.documentmanager.import

sealed interface ImportAction {

    data object OpenPicker : ImportAction

    data object Save : ImportAction

    data object Cancel : ImportAction

}
