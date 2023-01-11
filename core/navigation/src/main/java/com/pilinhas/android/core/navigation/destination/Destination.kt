package com.pilinhas.android.core.navigation.destination

import android.net.Uri
import com.pilinhas.android.core.navigation.extension.toPath

abstract class Destination(protected val path: String, vararg args: String) {

    protected fun routeBuilder(): Uri.Builder =
        Uri.Builder()
            .appendEncodedPath(path)

    val route: String =
        routeBuilder()
            .apply { args.forEach { appendEncodedPath(it.toPath()) } }
            .build()
            .toString()

}