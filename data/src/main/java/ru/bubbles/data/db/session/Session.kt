package ru.bubbles.data.db.session

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "session")
data class Session(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,
    val accessToken: String
)
