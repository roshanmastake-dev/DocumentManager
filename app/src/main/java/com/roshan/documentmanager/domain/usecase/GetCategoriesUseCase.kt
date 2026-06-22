package com.roshan.documentmanager.domain.usecase

import com.roshan.documentmanager.data.repository.CategoryRepository

class GetCategoriesUseCase(

    private val repository: CategoryRepository

) {

    operator fun invoke() = repository.getAllCategories()

}
