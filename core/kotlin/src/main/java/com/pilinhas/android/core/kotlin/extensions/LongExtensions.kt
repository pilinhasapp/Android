package com.vestibulario.core.kotlin.extensions

import com.vestibulario.core.kotlin.constants.LongConstants

fun Long?.orZero(): Long = this ?: LongConstants.ZERO