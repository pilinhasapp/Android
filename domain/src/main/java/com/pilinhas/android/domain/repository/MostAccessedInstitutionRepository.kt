package com.vestibulario.domain.repository

import com.vestibulario.domain.model.MostAccessedInstitution
import kotlinx.coroutines.flow.Flow

interface MostAccessedInstitutionRepository {
    fun getList(): Flow<List<MostAccessedInstitution>>
    fun syncLocalWithRemote(): Flow<Unit>
}