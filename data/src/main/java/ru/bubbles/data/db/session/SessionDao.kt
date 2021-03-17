package ru.bubbles.data.db.session

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SessionDao {
    @Query("SELECT * FROM session ORDER BY id DESC LIMIT 1")
    suspend fun getSession(): Session?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createSession(session: Session)

    @Query("DELETE FROM session")
    suspend fun clearSessions()
}