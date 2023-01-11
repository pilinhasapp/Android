package com.vestibulario.domain.repository

import com.vestibulario.domain.model.Region
import kotlinx.coroutines.flow.Flow

interface RegionRepository {
    fun getById(id: String): Flow<Region>
}