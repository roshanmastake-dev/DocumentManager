package com.roshan.documentmanager.domain.usecase

import com.roshan.documentmanager.data.repository.DocumentRepository

class GetFavoriteDocumentsUseCase(

    private val repository: DocumentRepository

) {

    operator fun invoke() =

        repository.getFavoriteDocuments()

}
