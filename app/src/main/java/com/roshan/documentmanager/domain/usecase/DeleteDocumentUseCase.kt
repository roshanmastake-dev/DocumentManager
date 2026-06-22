package com.roshan.documentmanager.domain.usecase

import com.roshan.documentmanager.data.local.entity.DocumentEntity
import com.roshan.documentmanager.data.repository.DocumentRepository

class DeleteDocumentUseCase(

    private val repository: DocumentRepository

) {

    suspend operator fun invoke(

        document: DocumentEntity

    ) {

        repository.delete(document)

    }

}
