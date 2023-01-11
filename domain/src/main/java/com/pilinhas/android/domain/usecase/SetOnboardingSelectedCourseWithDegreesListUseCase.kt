package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.CourseWithDegrees
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SetOnboardingSelectedCourseWithDegreesListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(courseWithDegreesList: List<CourseWithDegrees>): Flow<Unit> =
        goalRepository.setSelectedCourseWithDegreesList(courseWithDegreesList = courseWithDegreesList)
}