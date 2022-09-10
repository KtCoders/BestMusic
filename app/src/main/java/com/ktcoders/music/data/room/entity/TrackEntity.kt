package com.ktcoders.music.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TrackEntity(
    @PrimaryKey(autoGenerate = true)
    val trackId: Long = 0,
    val title: String,
    val imageUrl: String,
    val description: String
)