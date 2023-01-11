package com.vestibulario.domain.repository

import com.vestibulario.domain.model.Course
import kotlinx.coroutines.flow.Flow

interface CourseRepository {
    fun getById(id: String): Flow<Course>
    fun search(term: String): Flow<List<Course>>
}