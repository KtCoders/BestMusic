package com.ktcoders.music.ui.home

import androidx.lifecycle.ViewModel
import com.ktcoders.music.data.repository.TrackRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val trackRepository: TrackRepository) : ViewModel() {

//    private val _postListFlow = MutableSharedFlow<PagingData<Post>>(replay = 1, extraBufferCapacity = 0, onBufferOverflow = BufferOverflow.SUSPEND)
//    val postListFlow: SharedFlow<PagingData<Post>> get() = _postListFlow


//    fun getAllPosts() {
//        getAllPostsWithPagingData().cachedIn(viewModelScope).onEach {
//            _postListFlow.emitInScope(it, viewModelScope)
//        }.launchIn(viewModelScope)
//    }


}