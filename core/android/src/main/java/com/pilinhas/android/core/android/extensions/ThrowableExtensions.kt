package com.vestibulario.core.android.extensions

import com.google.firebase.crashlytics.FirebaseCrashlytics

fun Throwable.record() {
    printStackTrace()
    FirebaseCrashlytics.getInstance().recordException(this)
}