package com.vestibulario.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.vestibulario.core.database.model.MostAccessedCourseEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MostAccessedCourseDao {

    @Query("SELECT * FROM `most_accessed_course`")
    fun getAll(): Flow<List<MostAccessedCourseEntity>>

    @Query("SELECT * FROM `most_accessed_course` WHERE id = :id")
    fun getById(id: String): Flow<MostAccessedCourseEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(courseList: List<MostAccessedCourseEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(course: MostAccessedCourseEntity)

    @Query("DELETE FROM `most_accessed_course`")
    suspend fun clear()

    @Transaction
    suspend fun clearAndInsertAll(list: List<MostAccessedCourseEntity>) {
        clear()
        insertAll(list)
    }

}