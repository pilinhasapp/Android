package com.vestibulario.core.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "most_searched_term")
data class MostSearchedTermEntity(
    @PrimaryKey
    val term: String
)
