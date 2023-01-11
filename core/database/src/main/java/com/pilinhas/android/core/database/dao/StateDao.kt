package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vestibulario.core.database.model.StateEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface StateDao {

    @Query("SELECT * FROM `state`")
    fun getStateList(): Flow<List<StateEntity>>

    @Query("SELECT * FROM `state` WHERE id = :id")
    fun getStateById(id: String): Flow<StateEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(list: List<StateEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: StateEntity)

    @Query("DELETE FROM `state`")
    suspend fun clearStateList()

}