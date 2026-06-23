package com.roshan.documentmanager.backup

import android.content.Context
import android.net.Uri
import com.roshan.documentmanager.data.local.AppDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class BackupManager(

    private val context: Context

) {

    suspend fun backupDatabase(

        destinationUri: Uri

    ): Result<Unit> = withContext(

        Dispatchers.IO

    ) {

        try {

            val databasePath =

                context.getDatabasePath(

                    AppDatabase.DATABASE_NAME

                )

            if (!databasePath.exists()) {

                return@withContext Result.failure(

                    IllegalStateException(

                        "Database not found"

                    )

                )

            }

            val inputStream =

                FileInputStream(

                    databasePath

                )

            val outputStream =

                context.contentResolver.openOutputStream(

                    destinationUri

                ) ?: return@withContext Result.failure(

                    IllegalStateException(

                        "Unable to open destination"

                    )

                )

            inputStream.use { input ->

                outputStream.use { output ->

                    input.copyTo(output)

                }

            }

            Result.success(

                Unit

            )

        } catch (

            exception: Exception

        ) {

            Result.failure(

                exception

            )

        }

    }

    suspend fun backupFile(

        sourceFile: File,

        destinationUri: Uri

    ): Result<Unit> = withContext(

        Dispatchers.IO

    ) {

        try {

            val inputStream =

                FileInputStream(

                    sourceFile

                )

            val outputStream =

                context.contentResolver.openOutputStream(

                    destinationUri

                ) ?: return@withContext Result.failure(

                    IllegalStateException(

                        "Unable to open destination"

                    )

                )

            inputStream.use { input ->

                outputStream.use { output ->

                    input.copyTo(output)

                }

            }

            Result.success(

                Unit

            )

        } catch (

            exception: Exception

        ) {

            Result.failure(

                exception

            )

        }

    }

    suspend fun createLocalBackup(

        backupDirectory: File

    ): Result<File> = withContext(

        Dispatchers.IO

    ) {

        try {

            if (

                !backupDirectory.exists()

            ) {

                backupDirectory.mkdirs()

            }

            val database =

                context.getDatabasePath(

                    AppDatabase.DATABASE_NAME

                )

            val backupFile =

                File(

                    backupDirectory,

                    "DocumentManager_Backup.db"

                )

            FileInputStream(

                database

            ).use { input ->

                FileOutputStream(

                    backupFile

                ).use { output ->

                    input.copyTo(

                        output

                    )

                }

            }

            Result.success(

                backupFile

            )

        } catch (

            exception: Exception

        ) {

            Result.failure(

                exception

            )

        }

    }

}
