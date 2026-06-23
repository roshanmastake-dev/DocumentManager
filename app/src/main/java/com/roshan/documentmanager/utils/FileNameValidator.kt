package com.roshan.documentmanager.utils

object FileNameValidator {

    private val invalidCharacters = listOf(
        '/',
        '\\',
        ':',
        '*',
        '?',
        '"',
        '<',
        '>',
        '|'
    )

    fun isValid(name: String): Boolean {

        if (name.isBlank()) {
            return false
        }

        if (name.length > 100) {
            return false
        }

        return invalidCharacters.none {

            name.contains(it)

        }

    }

    fun sanitize(name: String): String {

        var result = name.trim()

        invalidCharacters.forEach {

            result = result.replace(

                it.toString(),

                ""

            )

        }

        return result

    }

}
