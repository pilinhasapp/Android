package com.pilinhas.android.core.kotlin.constants

import java.util.Locale

object LocaleConstants {
    private const val PORTUGUESE_ALPHA_2_CODE: String = "pt"
    private const val BRAZIL_ALPHA_2_CODE: String = "BR"
    val BRAZIL = Locale(PORTUGUESE_ALPHA_2_CODE, BRAZIL_ALPHA_2_CODE)
}