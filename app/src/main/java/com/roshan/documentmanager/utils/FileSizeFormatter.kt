package com.roshan.documentmanager.utils

import kotlin.math.ln
import kotlin.math.pow

object FileSizeFormatter {

    fun format(bytes: Long): String {

        if (bytes <= 0) return "0 B"

        val units = arrayOf("B", "KB", "MB", "GB")

        val digit = (ln(bytes.toDouble()) / ln(1024.0)).toInt()

        return String.format(

            "%.1f %s",

            bytes / 1024.0.pow(digit.toDouble()),

            units[digit]

        )

    }

}
