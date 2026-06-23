package com.roshan.documentmanager.ui.screen.home

sealed interface HomeEvent {

    data object AddCategory : HomeEvent

    data object AddDocument : HomeEvent

    data object OpenSearch : HomeEvent

    data object OpenSettings : HomeEvent

    data class OpenCategory(

        val categoryId: Long

    ) : HomeEvent

    data class OpenDocument(

        val documentId: Long

    ) : HomeEvent

}
