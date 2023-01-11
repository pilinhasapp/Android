package com.vestibulario.core.navigation.destination

import com.vestibulario.core.navigation.constants.PathConstants

object CourseDetailsDestination : Destination(path = PathConstants.COURSE_DETAILS, Arguments.ID) {

    operator fun invoke(id: String) =
        routeBuilder()
            .appendEncodedPath(id)
            .build()
            .toString()

    object Arguments {
        const val ID = "id"
    }
}