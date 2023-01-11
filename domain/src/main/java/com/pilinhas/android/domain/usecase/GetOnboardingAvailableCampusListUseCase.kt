package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Campus
import com.vestibulario.domain.model.Institution
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class GetOnboardingAvailableCampusListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(): Flow<List<Pair<Campus, Institution>>> =
        goalRepository.getAvailableCampusList()
}