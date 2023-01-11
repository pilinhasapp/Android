package com.vestibulario.core.kotlin.extensions

import com.vestibulario.core.kotlin.constants.DoubleConstants

fun Double?.orZero(): Double = this ?: DoubleConstants.ZERO