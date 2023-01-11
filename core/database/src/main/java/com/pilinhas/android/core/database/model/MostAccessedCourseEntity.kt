package com.vestibulario.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "most_accessed_course")
data class MostAccessedCourseEntity(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "name")
    val name: String
)
