package com.ktcoders.music.data.repository

import com.ktcoders.music.data.model.StateResult
import com.ktcoders.music.data.remote.RetrofitApi
import com.ktcoders.music.data.room.AppDatabase
import com.ktcoders.music.data.room.entity.TrackEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class TrackRepository @Inject constructor(
    private val appDatabase: AppDatabase,
    private val retrofitApi: RetrofitApi
) {

    suspend fun getAllTracks(): StateResult<List<TrackEntity>> {
        try {
        val response = retrofitApi.getAllTracks()
        if (response.isSuccessful) {// 200
            response.body()?.let {
                appDatabase.trackDao().insertAll(it)
                return StateResult.Success(it)
            }
        }
        } catch (e: Exception) {
            e.printStackTrace()
            return StateResult.Failure(e)
        }
        return StateResult.Loading
    }


}

