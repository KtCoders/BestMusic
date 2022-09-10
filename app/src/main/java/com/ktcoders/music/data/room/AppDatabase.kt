package com.ktcoders.music.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ktcoders.music.data.room.dao.TrackDao
import com.ktcoders.music.data.room.entity.TrackEntity

@Database(entities = [TrackEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun trackDao(): TrackDao

}