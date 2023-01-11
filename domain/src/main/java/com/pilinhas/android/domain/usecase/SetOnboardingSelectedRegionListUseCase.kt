package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Region
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SetOnboardingSelectedRegionListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(regionList: List<Region>): Flow<Unit> =
        goalRepository.setSelectedRegionList(regionList = regionList)
}