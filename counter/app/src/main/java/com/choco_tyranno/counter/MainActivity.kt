package com.choco_tyranno.counter

import android.app.Activity
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.choco_tyranno.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG","MainActivity created")
        setContentView(R.layout.activity_main)
        val viewModel : MainViewModel by viewModels()
        val binding : ActivityMainBinding =DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks{
            override fun onActivityStarted(activity: Activity) {
                Log.d(TAG, "onActivityStarted")
            }

            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                Log.d(TAG, "onActivityCreated")
            }

            override fun onActivityResumed(activity: Activity) {
                Log.d(TAG, "onActivityResumed")
            }

            override fun onActivityPaused(activity: Activity) {
                Log.d(TAG, "onActivityPaused")
            }

            override fun onActivityStopped(activity: Activity) {
                Log.d(TAG, "onActivityStopped")
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                Log.d(TAG, "onActivitySaveInstanceState")
            }

            override fun onActivityDestroyed(activity: Activity) {
                Log.d(TAG, "onActivityDestroyed")
            }

        })
    }

    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }
}