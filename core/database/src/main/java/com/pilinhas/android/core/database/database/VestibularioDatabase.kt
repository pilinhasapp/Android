package com.vestibulario.core.database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vestibulario.core.database.dao.CampusDao
import com.vestibulario.core.database.dao.CourseDao
import com.vestibulario.core.database.dao.DegreeDao
import com.vestibulario.core.database.dao.HistorySearchTermDao
import com.vestibulario.core.database.dao.InstitutionDao
import com.vestibulario.core.database.dao.MostAccessedCourseDao
import com.vestibulario.core.database.dao.MostAccessedInstitutionDao
import com.vestibulario.core.database.dao.MostSearchedTermDao
import com.vestibulario.core.database.dao.PeriodDao
import com.vestibulario.core.database.dao.RegionDao
import com.vestibulario.core.database.dao.StateDao
import com.vestibulario.core.database.dao.UserDao
import com.vestibulario.core.database.model.CampusEntity
import com.vestibulario.core.database.model.CourseEntity
import com.vestibulario.core.database.model.DegreeEntity
import com.vestibulario.core.database.model.HistorySearchTermEntity
import com.vestibulario.core.database.model.InstitutionEntity
import com.vestibulario.core.database.model.MostAccessedCourseEntity
import com.vestibulario.core.database.model.MostAccessedInstitutionEntity
import com.vestibulario.core.database.model.MostSearchedTermEntity
import com.vestibulario.core.database.model.PeriodEntity
import com.vestibulario.core.database.model.RegionEntity
import com.vestibulario.core.database.model.StateEntity
import com.vestibulario.core.database.model.UserEntity

@Database(
    entities = [
        CampusEntity::class,
        CourseEntity::class,
        DegreeEntity::class,
        HistorySearchTermEntity::class,
        InstitutionEntity::class,
        MostAccessedCourseEntity::class,
        MostAccessedInstitutionEntity::class,
        MostSearchedTermEntity::class,
        PeriodEntity::class,
        RegionEntity::class,
        StateEntity::class,
        UserEntity::class
    ],
    version = 1
)
abstract class VestibularioDatabase : RoomDatabase() {
    abstract fun campusDao(): CampusDao
    abstract fun courseDao(): CourseDao
    abstract fun degreeDao(): DegreeDao
    abstract fun historySearchTermDao(): HistorySearchTermDao
    abstract fun institutionDao(): InstitutionDao
    abstract fun mostAccessedCourseDao(): MostAccessedCourseDao
    abstract fun mostAccessedInstitutionDao(): MostAccessedInstitutionDao
    abstract fun mostSearchedTermDao(): MostSearchedTermDao
    abstract fun periodDao(): PeriodDao
    abstract fun regionDao(): RegionDao
    abstract fun stateDao(): StateDao
    abstract fun userDao(): UserDao
}