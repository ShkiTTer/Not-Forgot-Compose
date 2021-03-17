package ru.bubbles.data.db.common

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.bubbles.data.db.session.Session
import ru.bubbles.data.db.session.SessionDao

@Database(entities = [Session::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getSessionDao(): SessionDao
}