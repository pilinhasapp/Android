package com.vestibulario.core.kotlin.extensions

import com.vestibulario.core.kotlin.constants.IntConstants
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope

suspend inline fun <T, R> List<T>.mapAsync(crossinline transform: suspend (value: T) -> R): List<R> =
    map {
        coroutineScope {
            async { transform(it) }
        }
    }.awaitAll()

fun <T> List<T>.hasOnlyOneElement() =
    size.dec() == IntConstants.ZERO

fun <E> List<E>.replace(old: E, new: E) = map { if (it == old) new else it }