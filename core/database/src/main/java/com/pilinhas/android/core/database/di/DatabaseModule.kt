package com.vestibulario.core.database.di

import android.content.Context
import androidx.room.Room
import com.vestibulario.core.database.dao.*
import com.vestibulario.core.database.database.VestibularioDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(
        @ApplicationContext context: Context
    ): VestibularioDatabase {
        return Room.databaseBuilder(
            context,
            VestibularioDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun providesCampusDao(
        database: VestibularioDatabase
    ): CampusDao {
        return database.campusDao()
    }

    @Singleton
    @Provides
    fun providesCourseDao(
        database: VestibularioDatabase
    ): CourseDao {
        return database.courseDao()
    }

    @Singleton
    @Provides
    fun providesDegreeDao(
        database: VestibularioDatabase
    ): DegreeDao {
        return database.degreeDao()
    }

    @Singleton
    @Provides
    fun providesHistorySearchTermDao(
        database: VestibularioDatabase
    ): HistorySearchTermDao {
        return database.historySearchTermDao()
    }

    @Singleton
    @Provides
    fun providesInstitutionDao(
        database: VestibularioDatabase
    ): InstitutionDao {
        return database.institutionDao()
    }

    @Singleton
    @Provides
    fun providesMostAccessedCourseDao(
        database: VestibularioDatabase
    ): MostAccessedCourseDao {
        return database.mostAccessedCourseDao()
    }

    @Singleton
    @Provides
    fun providesMostAccessedInstitutionDao(
        database: VestibularioDatabase
    ): MostAccessedInstitutionDao {
        return database.mostAccessedInstitutionDao()
    }

    @Singleton
    @Provides
    fun providesMostSearchedTermDao(
        database: VestibularioDatabase
    ): MostSearchedTermDao {
        return database.mostSearchedTermDao()
    }

    @Singleton
    @Provides
    fun providesPeriodDao(
        database: VestibularioDatabase
    ): PeriodDao {
        return database.periodDao()
    }

    @Singleton
    @Provides
    fun providesRegionDao(
        database: VestibularioDatabase
    ): RegionDao {
        return database.regionDao()
    }

    @Singleton
    @Provides
    fun providesStateDao(
        database: VestibularioDatabase
    ): StateDao {
        return database.stateDao()
    }

    @Singleton
    @Provides
    fun providesUserDao(
        database: VestibularioDatabase
    ): UserDao {
        return database.userDao()
    }

    companion object {
        private const val DATABASE_NAME = "vestibulario_database"
    }

}