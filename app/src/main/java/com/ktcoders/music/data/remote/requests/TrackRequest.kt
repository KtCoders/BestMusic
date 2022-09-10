package com.ktcoders.music.data.remote.requests

import com.google.gson.annotations.SerializedName

data class TrackRequest(
    @SerializedName("trackId") var trackId: String = "",
    @SerializedName("title") var title: String = "",
    @SerializedName("imageUrl") var imageUrl: String = "",
    @SerializedName("description") var description: String = ""
)