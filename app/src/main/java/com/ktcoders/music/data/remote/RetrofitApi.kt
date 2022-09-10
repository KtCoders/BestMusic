package com.ktcoders.music.data.remote

import com.ktcoders.music.data.room.entity.TrackEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {

    @GET("track/getAll")
    suspend fun getAllTracks(): Response<List<TrackEntity>>

//    @PUT("score/update")
//    suspend fun updateScore(@Query("mobile") mobile: String, @Query("score") score: Long): Response<String>
//
//    ////////////////////
//
//    @POST("log/insert")
//    suspend fun insertLog(@Body logModel: TrackRequest): Response<Unit>
//
//    @Streaming
//    @GET
//    suspend fun downloadFileByUrl(@Url fileUrl: String): Response<ResponseBody>
//
//    @GET
//    suspend fun getTranslate(@Url fullUrl: String): Response<TranslateResponse>
//
//    ////////////////////////
//
//    @GET("sentence/findAll")
//    suspend fun getAllSentence(): Response<List<SentenceEntity>>
//
//    @PUT("userHistory/insertAll")
//    suspend fun insertAllHistory(@Body historyEntity: List<HistoryEntity>): Response<String>
//
//    @PUT("userHistory/insert")
//    suspend fun insertHistory(@Body historyEntity: HistoryEntity): Response<String>
//
//    @GET("userHistory/findTotalCount")
//    suspend fun findTotalCount(@Query("mobile") mobile: String): Response<Long>
//
//    @GET("userHistory/findAll")
//    suspend fun getUserHistory(@Query("mobile") mobile: String): Response<List<HistoryEntity>>
//
//    @GET("version/getAll?packageName=ir.hienglish.app")
//    suspend fun getAllVersions(): Response<VersionEntity>
//
//    @POST("topic/getAll")
//    suspend fun getAllTopics(): Response<List<TopicEntity>>
//
//    @POST("slide/getAll")
//    suspend fun getAllSlides(): Response<List<SlideEntity>>
//
//    @POST("question/getAll")
//    suspend fun getAllQuestions(): Response<List<QuestionEntity>>
//
//    @POST("media/getAll")
//    suspend fun getAllMedias(): Response<List<MediaEntity>>
//
//    /////////////////////
//
//    @PATCH("user/updateProfile")
//    suspend fun updateProfile(@Body updateProfileRequest: UpdateProfileRequest): Response<UserResponse>
//
//    @POST("user/otpVerify")
//    suspend fun otpVerify(@Body otpVerifyRequest: OTPVerifyRequest): Response<UserResponse>
//
//    @POST("user/mobileVerify")
//    suspend fun mobileVerify(@Body mobileVerifyRequest: MobileVerifyRequest): Response<Unit>
//
//    @POST("user/getUserInfo")
//    suspend fun getUserInfo(): Response<UserResponse>
//
//    @Multipart
//    @PATCH("user/uploadAvatar")
//    suspend fun uploadAvatar(@Part multipartFile: MultipartBody.Part): Response<UserResponse>

}