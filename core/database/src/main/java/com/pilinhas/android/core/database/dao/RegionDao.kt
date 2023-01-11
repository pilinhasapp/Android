package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vestibulario.core.database.model.RegionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RegionDao {

    @Query("SELECT * FROM `region`")
    fun getRegionList(): Flow<List<RegionEntity>>

    @Query("SELECT * FROM `region` WHERE id = :id")
    fun getRegionById(id: String): Flow<RegionEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(list: List<RegionEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: RegionEntity)

    @Query("DELETE FROM `region`")
    suspend fun clearRegionList()

}