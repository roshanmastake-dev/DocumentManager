package com.roshan.documentmanager.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateFormatter {

    fun format(

        time: Long

    ): String {

        return SimpleDateFormat(

            "dd MMM yyyy",

            Locale.getDefault()

        ).format(

            Date(time)

        )

    }

}
