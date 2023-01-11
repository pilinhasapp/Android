package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vestibulario.core.database.model.DegreeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DegreeDao {

    @Query("SELECT * FROM `degree`")
    fun getAll(): Flow<List<DegreeEntity>>

    @Query("SELECT * FROM `degree` WHERE id = :id")
    fun getById(id: String): Flow<DegreeEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(degreeList: List<DegreeEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(degree: DegreeEntity)

    @Query("DELETE FROM `degree`")
    suspend fun clear()

}