package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vestibulario.core.database.model.InstitutionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface InstitutionDao {

    @Query("SELECT * FROM `institution`")
    fun getAll(): Flow<List<InstitutionEntity>>

    @Query("SELECT * FROM `institution` WHERE id = :id")
    fun getById(id: String): Flow<InstitutionEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(institutionList: List<InstitutionEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(institution: InstitutionEntity)

    @Query("DELETE FROM `institution`")
    suspend fun clear()

}