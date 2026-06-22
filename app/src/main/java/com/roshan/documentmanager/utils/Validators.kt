package com.roshan.documentmanager.utils

object Validators {

    fun validCategory(

        value: String

    ): Boolean {

        return value.trim().isNotEmpty()

    }

}
