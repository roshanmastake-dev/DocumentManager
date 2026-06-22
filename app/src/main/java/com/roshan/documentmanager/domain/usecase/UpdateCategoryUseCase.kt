package com.roshan.documentmanager.domain.usecase

import com.roshan.documentmanager.data.local.entity.CategoryEntity
import com.roshan.documentmanager.data.repository.CategoryRepository

class UpdateCategoryUseCase(
    private val repository: CategoryRepository
) {

    suspend operator fun invoke(
        category: CategoryEntity
    ) {

        repository.update(category)

    }

}
