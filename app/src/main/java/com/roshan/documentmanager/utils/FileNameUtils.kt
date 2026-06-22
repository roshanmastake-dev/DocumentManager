package com.roshan.documentmanager.utils

object FileNameUtils {

    fun removeExtension(

        name: String

    ): String {

        val index = name.lastIndexOf('.')

        if (index == -1) {

            return name

        }

        return name.substring(

            0,

            index

        )

    }

}
