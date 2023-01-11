package com.pilinhas.android.core.android.extensions

import com.google.firebase.crashlytics.FirebaseCrashlytics

fun Throwable.record() {
    printStackTrace()
    FirebaseCrashlytics.getInstance().recordException(this)
}