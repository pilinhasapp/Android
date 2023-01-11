package com.vestibulario.domain.usecase

import com.vestibulario.domain.model.MostAccessedCourse
import com.vestibulario.domain.repository.MostAccessedCourseRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class GetMostAccessedCourseListUseCase @Inject constructor(
    private val mostAccessedCourseRepository: MostAccessedCourseRepository
) {
    operator fun invoke(): Flow<List<MostAccessedCourse>> =
        mostAccessedCourseRepository.getList()
}