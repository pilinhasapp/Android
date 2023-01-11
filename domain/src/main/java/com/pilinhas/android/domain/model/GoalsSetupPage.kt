package com.vestibulario.domain.model

enum class GoalsSetupPage(val route: String) {
    SELECT_COURSE(route = "select_course"),
    SELECT_DEGREE(route = "select_degree"),
    SELECT_PERIOD(route = "select_period"),
    SELECT_REGION(route = "select_region"),
    SELECT_STATE(route = "select_state"),
    SELECT_INSTITUTION(route = "select_institution"),
    SELECT_CAMPUS(route = "select_campus"),
    CONFIRM_SELECTION(route = "confirm_selection");

    companion object {
        fun getByRoute(route: String?) = values().find { it.route == route }
    }
}