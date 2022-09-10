package com.ktcoders.music.data.room.dao

import androidx.room.*
import com.ktcoders.music.data.room.entity.TrackEntity

@Dao
interface TrackDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(trackEntity: TrackEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(trackEntity: List<TrackEntity>)

    @Query("SELECT * FROM TrackEntity")
    suspend fun getAll(): List<TrackEntity>


//    @Query("SELECT * FROM TrackEntity LIMIT :limit OFFSET :offset")
//    suspend fun finAll(offset: Int, limit: Int): List<TrackEntity>


}