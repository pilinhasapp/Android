package com.vestibulario.domain.model

enum class SearchType(val id: String) {
    INSTITUTION(id = "institution"),
    CAMPUS(id = "campus"),
    COURSE(id = "course");

    companion object {
        fun getById(id: String): SearchType? = values().find { it.id == id }
    }
}
