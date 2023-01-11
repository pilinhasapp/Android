package com.vestibulario.domain.repository

import com.vestibulario.domain.model.Degree
import kotlinx.coroutines.flow.Flow

interface DegreeRepository {
    fun getById(id: String): Flow<Degree>
}