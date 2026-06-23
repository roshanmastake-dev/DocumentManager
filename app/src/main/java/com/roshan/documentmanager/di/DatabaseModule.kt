package com.roshan.documentmanager.di

import android.content.Context
import androidx.room.Room
import com.roshan.documentmanager.data.local.AppDatabase
import com.roshan.documentmanager.data.local.dao.CategoryDao
import com.roshan.documentmanager.data.local.dao.DocumentDao
import com.roshan.documentmanager.data.repository.CategoryRepository
import com.roshan.documentmanager.data.repository.DocumentRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {

        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()

    }

    @Provides
    fun provideCategoryDao(
        database: AppDatabase
    ): CategoryDao {

        return database.categoryDao()

    }

    @Provides
    fun provideDocumentDao(
        database: AppDatabase
    ): DocumentDao {

        return database.documentDao()

    }

    @Provides
    @Singleton
    fun provideCategoryRepository(
        dao: CategoryDao
    ): CategoryRepository {

        return CategoryRepository(dao)

    }

    @Provides
    @Singleton
    fun provideDocumentRepository(
        dao: DocumentDao
    ): DocumentRepository {

        return DocumentRepository(dao)

    }

}
