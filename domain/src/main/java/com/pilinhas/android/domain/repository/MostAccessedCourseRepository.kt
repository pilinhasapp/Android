package com.vestibulario.domain.repository

import com.vestibulario.domain.model.MostAccessedCourse
import com.vestibulario.domain.model.MostAccessedInstitution
import kotlinx.coroutines.flow.Flow

interface MostAccessedCourseRepository {
    fun getList(): Flow<List<MostAccessedCourse>>
    fun syncLocalWithRemote(): Flow<Unit>
}