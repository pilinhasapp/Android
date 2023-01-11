package com.pilinhas.android.core.kotlin.extensions

import com.pilinhas.android.core.kotlin.constants.LongConstants

fun Long?.orZero(): Long = this ?: LongConstants.ZERO