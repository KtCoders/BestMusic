package com.ktcoders.music.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<B : ViewBinding, V : BaseViewModel>(private var sharedViewModel: Boolean = false) : Fragment(), View.OnClickListener {

    protected lateinit var binding: B
    protected lateinit var viewModel: V

    protected abstract fun getViewBinding(): B
    protected abstract fun getViewModelClass(): Class<V>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding()
        viewModel = if (sharedViewModel) {
            ViewModelProvider(requireActivity())[getViewModelClass()]
        } else {
            ViewModelProvider(this)[getViewModelClass()]
        }
        return binding.root
    }

//    fun startActivityAndFinish(cls: Class<*>) {
//        startActivity(Intent(requireActivity(), cls))
//        requireActivity().finish()
//    }
//
//    fun startActivity(cls: Class<*>) {
//        startActivity(Intent(requireActivity(), cls))
//    }

//    override fun onResume() {
//        super.onResume()
//        if (!Utils.isOnline(requireContext())) {
//            requireContext().toast2(getString(R.string.no_internet))
//            return
//        }
//    }

}