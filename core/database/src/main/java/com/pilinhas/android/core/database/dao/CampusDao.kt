package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vestibulario.core.database.model.CampusEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CampusDao {

    @Query("SELECT * FROM `campus`")
    fun getAll(): Flow<List<CampusEntity>>

    @Query("SELECT * FROM `campus` WHERE id = :id")
    fun getById(id: String): Flow<CampusEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(campusList: List<CampusEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(campus: CampusEntity)

    @Query("DELETE FROM `campus`")
    suspend fun clear()

}