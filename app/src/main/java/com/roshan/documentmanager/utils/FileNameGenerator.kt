package com.roshan.documentmanager.utils

object FileNameGenerator {

    fun generateCopyName(

        original: String

    ): String {

        val dot = original.lastIndexOf(".")

        if (dot == -1) {

            return "${original}_copy"

        }

        val name = original.substring(

            0,

            dot

        )

        val ext = original.substring(

            dot

        )

        return "${name}_copy$ext"

    }

}
