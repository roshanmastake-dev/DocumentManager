package com.roshan.documentmanager.print

import android.content.Context
import android.net.Uri
import android.print.PrintAttributes
import android.print.PrintManager

object DocumentPrintManager {

    fun print(

        context: Context,

        jobName: String,

        adapter: android.print.PrintDocumentAdapter

    ) {

        val manager =

            context.getSystemService(

                Context.PRINT_SERVICE

            ) as PrintManager

        manager.print(

            jobName,

            adapter,

            PrintAttributes.Builder().build()

        )

    }

}
