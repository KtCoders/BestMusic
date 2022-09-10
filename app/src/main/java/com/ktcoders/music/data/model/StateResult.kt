package com.ktcoders.music.data.model

sealed class StateResult<out T> {

    object None : StateResult<Nothing>()
    object Loading : StateResult<Nothing>()

    data class Success<out T>(
        val data: T?
    ) : StateResult<T>()

    data class Failure(
        val e: Throwable?
    ) : StateResult<Nothing>()

}