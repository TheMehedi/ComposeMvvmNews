package com.example.newsappcompose

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Mohammad Mehedi Hasan on 15,September,2024
 * Email: themehedi.pro@gmail.com
 */

@HiltAndroidApp
class NewsApp : Application() {


  override fun onCreate() {
    super.onCreate()

    Log.d(TAG, "Coming inside on create!")
  }

  companion object {

    const val TAG = "News App"
  }
}