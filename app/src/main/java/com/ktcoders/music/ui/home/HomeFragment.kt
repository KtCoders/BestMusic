package com.ktcoders.music.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.ktcoders.music.data.model.StateResult
import com.ktcoders.music.databinding.FragmentHomeBinding
import com.ktcoders.music.tools.MyExtensions.lockScreenShot
import com.ktcoders.music.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun getViewBinding() = FragmentHomeBinding.inflate(layoutInflater)
    override fun getViewModelClass() = HomeViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.allMusicEvent.observe(viewLifecycleOwner) { data ->
            val success = data as StateResult.Success
            val failed = data as StateResult.Failure
//            val loading = data as StateResult.Loading

            if (success != null) {
                binding.recyclerView ///
                binding.progressBar.visibility = View.GONE
            } else if (failed != null) {
                binding.textView.text = failed.e.toString()
                binding.progressBar.visibility = View.GONE
            } else {
                binding.progressBar.visibility = View.VISIBLE
            }

        }


    }

    override fun onClick(p0: View?) {

    }


}

