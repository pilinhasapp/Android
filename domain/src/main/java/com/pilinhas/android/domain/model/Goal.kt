package com.vestibulario.domain.model

data class Goal(
    val id: String,
    val course: Course,
    val degree: Degree,
    val period: Period,
    val institution: Institution,
    val campus: Campus
)
