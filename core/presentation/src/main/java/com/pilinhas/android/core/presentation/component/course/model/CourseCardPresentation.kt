package com.vestibulario.core.presentation.component.course.model

import com.vestibulario.domain.model.Course

data class CourseCardPresentation(
    val course: Course,
    val isSelected: Boolean
)
