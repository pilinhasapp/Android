package com.vestibulario.domain.repository

import com.vestibulario.domain.model.*
import kotlinx.coroutines.flow.Flow

interface GoalRepository {
    fun getCanProceedByPage(page: GoalsSetupPage): Flow<Boolean>
    fun setSelectedCourseList(courseList: List<Course>): Flow<Unit>
    fun getAvailableDegreeList(): Flow<List<CourseWithDegrees>>
    fun setSelectedCourseWithDegreesList(courseWithDegreesList: List<CourseWithDegrees>): Flow<Unit>
    fun getAvailablePeriodList(): Flow<List<Period>>
    fun setSelectedPeriodList(periodList: List<Period>): Flow<Unit>
    fun getAvailableRegionList(): Flow<List<Region>>
    fun setSelectedRegionList(regionList: List<Region>): Flow<Unit>
    fun getAvailableStateList(): Flow<List<State>>
    fun setSelectedStateList(stateList: List<State>): Flow<Unit>
    fun getAvailableInstitutionList(): Flow<List<Institution>>
    fun setSelectedInstitutionList(institutionList: List<Institution>): Flow<Unit>
    fun getAvailableCampusList(): Flow<List<Pair<Campus, Institution>>>
    fun setSelectedCampusList(campusList: List<Campus>): Flow<Unit>
    fun getGoalList(): Flow<List<Goal>>
    fun setGoalList(goalList: List<Goal>): Flow<Unit>
    fun save(): Flow<Unit>
    fun clear()
}