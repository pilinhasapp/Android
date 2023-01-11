package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Period
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SetOnboardingSelectedPeriodListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(periodList: List<Period>): Flow<Unit> =
        goalRepository.setSelectedPeriodList(periodList = periodList)
}