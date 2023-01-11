package com.vestibulario.domain.model

data class CourseWithDegrees(
    val course: Course,
    val degreeList: List<Degree>
)
