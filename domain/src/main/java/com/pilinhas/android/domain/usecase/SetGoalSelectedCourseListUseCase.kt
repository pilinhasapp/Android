package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Course
import com.vestibulario.domain.repository.GoalRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SetGoalSelectedCourseListUseCase @Inject constructor(
    private val goalRepository: GoalRepository
) {
    operator fun invoke(courseList: List<Course>): Flow<Unit> =
        goalRepository.setSelectedCourseList(courseList = courseList)
}