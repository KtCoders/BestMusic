package com.ktcoders.music.ui.base

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import java.util.*

abstract class BaseActivity<B : ViewBinding, V : BaseViewModel> : AppCompatActivity(), View.OnClickListener {

    protected lateinit var binding: B
    protected lateinit var viewModel: V

    protected abstract fun getViewBinding(): B
    protected abstract fun getViewModelClass(): Class<V>

    protected abstract fun init()

    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {

        Locale.setDefault(Locale("fa"))
        val config = resources.configuration
        config.setLocale(Locale("fa"))
        createConfigurationContext(config)
        resources.updateConfiguration(config, resources.displayMetrics)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = getViewBinding()
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[getViewModelClass()]

        init()

        if (viewModel.appSettingManager.getAppSetting().nightMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

    }

    fun startActivityAndFinish(cls: Class<*>) {
        startActivity(Intent(this, cls))
        finish()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    fun startActivity(cls: Class<*>) {
        startActivity(Intent(this, cls))
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }


}