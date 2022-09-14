package com.ktcoders.music.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ktcoders.music.data.model.StateResult
import com.ktcoders.music.data.repository.TrackRepository
import com.ktcoders.music.data.room.entity.TrackEntity
import com.ktcoders.music.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val trackRepository: TrackRepository) : BaseViewModel() {

    private val _allMusicEvent = MutableLiveData<StateResult<List<TrackEntity>>>()
    val allMusicEvent: LiveData<StateResult<List<TrackEntity>>> get() = _allMusicEvent

    fun getAllMusic() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = trackRepository.getAllTracks()
            _allMusicEvent.postValue(data)
        }


//    private val _postListFlow = MutableSharedFlow<PagingData<Post>>(replay = 1, extraBufferCapacity = 0, onBufferOverflow = BufferOverflow.SUSPEND)
//    val postListFlow: SharedFlow<PagingData<Post>> get() = _postListFlow
//        getAllPostsWithPagingData().cachedIn(viewModelScope).onEach {
//            _postListFlow.emitInScope(it, viewModelScope)
//        }.launchIn(viewModelScope)

    }

}