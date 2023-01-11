package com.pilinhas.android.domain.usecase

import com.pilinhas.android.domain.model.Outcome
import com.pilinhas.android.domain.repository.OutcomeRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class AddOutcomeUseCase @Inject constructor(
    private val outcomeRepository: OutcomeRepository
) {
    operator fun invoke(outcome: Outcome): Flow<Unit> =
        outcomeRepository.add(outcome = outcome)
}