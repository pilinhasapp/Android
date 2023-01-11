package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.Course
import com.vestibulario.domain.repository.CourseRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class SearchCourseUseCase @Inject constructor(
    private val courseRepository: CourseRepository
) {
    operator fun invoke(term: String): Flow<List<Course>> =
        courseRepository.search(term = term)
}