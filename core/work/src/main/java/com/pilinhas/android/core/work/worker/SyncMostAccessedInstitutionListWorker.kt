package com.vestibulario.core.work.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.vestibulario.core.android.di.IoDispatcher
import com.vestibulario.core.work.extensions.doWork
import com.vestibulario.domain.repository.MostAccessedInstitutionRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

@HiltWorker
internal class SyncMostAccessedInstitutionListWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    private val mostAccessedInstitutionRepository: MostAccessedInstitutionRepository,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result = withContext(ioDispatcher) {
        mostAccessedInstitutionRepository.syncLocalWithRemote().doWork(timeoutInMillis = TIMEOUT_IN_MILLIS)
    }

    companion object {
        private const val TIMEOUT_IN_MILLIS = 60000L
    }
}