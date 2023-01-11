package com.vestibulario.core.work.extensions

import androidx.work.ListenableWorker.Result
import com.vestibulario.core.android.extensions.record
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.lastOrNull
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.withTimeoutOrNull

internal fun <T> Flow<T>.asResultFlow(): Flow<Result> =
    transform { emit(Result.success()) }
        .catch { throwable ->
            throwable.record()
            emit(Result.failure())
        }

suspend fun <T> Flow<T>.doWork(timeoutInMillis: Long): Result =
    withTimeoutOrNull(timeoutInMillis) { asResultFlow().lastOrNull() } ?: Result.failure()