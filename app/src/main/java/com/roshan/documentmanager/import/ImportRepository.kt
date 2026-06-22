package com.roshan.documentmanager.import

import android.net.Uri

class ImportRepository {

    private val files = mutableListOf<Uri>()

    fun setFiles(

        list: List<Uri>

    ) {

        files.clear()

        files.addAll(list)

    }

    fun getFiles(): List<Uri> {

        return files

    }

    fun clear() {

        files.clear()

    }

}
