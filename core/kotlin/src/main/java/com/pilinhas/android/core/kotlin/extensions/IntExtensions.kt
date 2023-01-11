package com.pilinhas.android.core.kotlin.extensions

import com.pilinhas.android.core.kotlin.constants.IntConstants

fun Int?.orZero(): Int = this ?: IntConstants.ZERO