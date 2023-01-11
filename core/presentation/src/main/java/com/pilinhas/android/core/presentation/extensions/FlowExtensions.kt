package com.pilinhas.android.core.presentation.extensions

import com.pilinhas.android.core.android.extensions.record
import com.pilinhas.android.core.presentation.model.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.transform

internal fun <T> Flow<T>.asTaskFlow(): Flow<Task<T>> =
    transform<T, Task<T>> { emit(Task.Success(it)) }
        .onStart { emit(Task.Loading) }
        .catch { throwable ->
            throwable.record()
            emit(Task.Error(throwable = throwable))
        }

suspend fun <T> Flow<T>.collectAsTask(collector: FlowCollector<Task<T>>) {
    asTaskFlow().collect(collector = collector)
}

suspend fun <T> Flow<T>.collectAsTask() {
    asTaskFlow().collect {}
}