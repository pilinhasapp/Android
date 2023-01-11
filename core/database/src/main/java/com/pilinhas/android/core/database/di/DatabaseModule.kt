package com.pilinhas.android.core.database.di

import android.content.Context
import androidx.room.Room
import com.pilinhas.android.core.database.dao.IncomeDao
import com.pilinhas.android.core.database.dao.OutcomeDao
import com.pilinhas.android.core.database.database.PilinhasDatabase
import com.pilinhas.android.core.database.dao.*
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
    ): PilinhasDatabase {
        return Room.databaseBuilder(
            context,
            PilinhasDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun providesIncomeDao(
        database: PilinhasDatabase
    ): IncomeDao {
        return database.incomeDao()
    }

    @Singleton
    @Provides
    fun providesOutcomeDao(
        database: PilinhasDatabase
    ): OutcomeDao {
        return database.outcomeDao()
    }
    companion object {
        private const val DATABASE_NAME = "pilinhas_database"
    }

}