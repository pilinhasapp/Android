package com.pilinhas.android.core.kotlin.extensions

import com.pilinhas.android.core.kotlin.constants.DoubleConstants

fun Double?.orZero(): Double = this ?: DoubleConstants.ZERO