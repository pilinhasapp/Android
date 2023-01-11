package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.vestibulario.core.database.model.MostSearchedTermEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MostSearchedTermDao {

    @Query("SELECT * FROM `most_searched_term`")
    fun getAll(): Flow<List<MostSearchedTermEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(list: List<MostSearchedTermEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: MostSearchedTermEntity)

    @Query("DELETE FROM `most_searched_term`")
    suspend fun clear()

    @Transaction
    suspend fun clearAndInsertAll(list: List<MostSearchedTermEntity>) {
        clear()
        insertAll(list)
    }

}