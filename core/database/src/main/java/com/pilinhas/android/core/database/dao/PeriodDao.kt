package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vestibulario.core.database.model.PeriodEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PeriodDao {

    @Query("SELECT * FROM `period`")
    fun getAll(): Flow<List<PeriodEntity>>

    @Query("SELECT * FROM `period` WHERE id = :id")
    fun getById(id: String): Flow<PeriodEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(periodList: List<PeriodEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(period: PeriodEntity)

    @Query("DELETE FROM `period`")
    suspend fun clear()

}