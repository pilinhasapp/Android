package com.vestibulario.core.kotlin.extensions

import com.vestibulario.core.kotlin.constants.IntConstants

fun Int?.orZero(): Int = this ?: IntConstants.ZERO