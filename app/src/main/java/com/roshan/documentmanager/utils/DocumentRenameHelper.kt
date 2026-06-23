package com.roshan.documentmanager.utils

object DocumentRenameHelper {

    fun rename(

        oldName: String,

        newName: String

    ): String {

        val extension = oldName.substringAfterLast(
            ".",
            ""
        )

        val name = newName.trim()

        if (extension.isEmpty()) {

            return name

        }

        return if (

            name.endsWith(".$extension")

        ) {

            name

        } else {

            "$name.$extension"

        }

    }

}
