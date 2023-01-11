package com.pilinhas.android.core.navigation.extension

fun String.toPath() =
    PATH_BEGIN_DELIMITER + this + PATH_END_DELIMITER

private const val PATH_BEGIN_DELIMITER = "{"
private const val PATH_END_DELIMITER = "}"