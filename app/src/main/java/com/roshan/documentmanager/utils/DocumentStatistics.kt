package com.roshan.documentmanager.utils

import com.roshan.documentmanager.data.local.entity.DocumentEntity

data class DocumentStatistics(

    val totalFiles: Int,

    val totalImages: Int,

    val totalPdf: Int,

    val totalSize: Long

)

object StatisticsGenerator {

    fun generate(

        documents: List<DocumentEntity>

    ): DocumentStatistics {

        val images = documents.count {

            it.mimeType.startsWith("image")

        }

        val pdf = documents.count {

            it.mimeType == "application/pdf"

        }

        val size = documents.sumOf {

            it.size

        }

        return DocumentStatistics(

            totalFiles = documents.size,

            totalImages = images,

            totalPdf = pdf,

            totalSize = size

        )

    }

}
