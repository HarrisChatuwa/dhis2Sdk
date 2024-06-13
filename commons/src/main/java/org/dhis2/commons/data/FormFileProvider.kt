package org.dhis2.commons.data

import android.content.Context

object FormFileProvider {

    lateinit var fileProviderAuthority: String

    fun init(context: Context) {
        fileProviderAuthority = "${context.packageName}.form.data.FormFileProvider"
    }
}
