package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.vestibulario.core.database.model.HistorySearchTermEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HistorySearchTermDao {

    @Query("SELECT *, MAX(`timestamp`) FROM `history_search_term` GROUP BY `term` ORDER BY `timestamp` DESC")
    fun getLatest(): Flow<List<HistorySearchTermEntity>>

    @Query("SELECT * FROM `history_search_term` WHERE `uid` IS NOT NULL")
    fun getAllUnknown(): Flow<List<HistorySearchTermEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(list: List<HistorySearchTermEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: HistorySearchTermEntity)

    @Query("DELETE FROM `history_search_term`")
    suspend fun clear()

    @Transaction
    suspend fun clearAndInsertAll(list: List<HistorySearchTermEntity>) {
        clear()
        insertAll(list)
    }

}