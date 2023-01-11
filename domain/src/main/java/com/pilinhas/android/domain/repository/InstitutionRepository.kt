package com.vestibulario.domain.repository

import com.vestibulario.domain.model.Institution
import kotlinx.coroutines.flow.Flow

interface InstitutionRepository {
    fun getById(id: String): Flow<Institution>
}