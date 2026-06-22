package com.roshan.documentmanager.domain.usecase

import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.data.repository.DocumentRepository

class AddDocumentUseCase(

    private val repository: DocumentRepository

) {

    suspend operator fun invoke(

        document: DocumentEntity

    ) {

        repository.insert(document)

    }

}
