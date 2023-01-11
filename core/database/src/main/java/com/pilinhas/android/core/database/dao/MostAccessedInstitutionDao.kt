package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.vestibulario.core.database.model.MostAccessedInstitutionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MostAccessedInstitutionDao {

    @Query("SELECT * FROM `most_accessed_institution`")
    fun getAll(): Flow<List<MostAccessedInstitutionEntity>>

    @Query("SELECT * FROM `most_accessed_institution` WHERE id = :id")
    fun getById(id: String): Flow<MostAccessedInstitutionEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(institutionList: List<MostAccessedInstitutionEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(institution: MostAccessedInstitutionEntity)

    @Query("DELETE FROM `most_accessed_institution`")
    suspend fun clear()

    @Transaction
    suspend fun clearAndInsertAll(list: List<MostAccessedInstitutionEntity>) {
        clear()
        insertAll(list)
    }

}