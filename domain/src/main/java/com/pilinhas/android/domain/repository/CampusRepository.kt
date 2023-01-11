package com.vestibulario.domain.repository

import com.vestibulario.domain.model.Campus
import kotlinx.coroutines.flow.Flow

interface CampusRepository {
    fun getById(id: String): Flow<Campus>
}