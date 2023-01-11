package com.vestibulario.core.kotlin.extensions

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map

inline fun <T, R> Flow<T?>.mapIfNotNull(
    crossinline transform: suspend (value: T) -> R
): Flow<R?> =
    map { value -> value?.let { transform(it) } }

fun <T> Flow<T>.mapToUnit(): Flow<Unit> = map { }

@OptIn(FlowPreview::class)
inline fun <T> Flow<T?>.flatMapConcatIfNull(
    crossinline transform: suspend () -> Flow<T>
): Flow<T> =
    flatMapConcat { value -> value?.let { flowOf(it) } ?: transform() }

@OptIn(FlowPreview::class)
inline fun <T> Flow<List<T>?>.flatMapConcatIfNullOrEmpty(
    crossinline transform: suspend () -> Flow<List<T>>
): Flow<List<T>> =
    flatMapConcat { value -> value?.takeIf { it.isNotEmpty() }?.let { flowOf(it) } ?: transform() }

@OptIn(FlowPreview::class)
inline fun <T1, T2> Flow<T1>.onEachFlow(crossinline flow: (value: T1) -> Flow<T2>): Flow<T1> =
    flatMapConcat { result1 -> flow(result1).map { result1 } }

inline fun <T, R> Flow<List<T>>.mapListItemsAsync(crossinline transform: suspend (value: T) -> R): Flow<List<R>> =
    map { it.mapAsync(transform) }

inline fun <reified T1, reified T2> Flow<T1>.combineToPair(flowTwo: Flow<T2>): Flow<Pair<T1, T2>> =
    combine(flowTwo) { resultOne, resultTwo -> resultOne to resultTwo }