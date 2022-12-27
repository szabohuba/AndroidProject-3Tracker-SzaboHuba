package com.zoltanlorinczi.project_retrofit

import android.app.Application
import com.zoltanlorinczi.project_retrofit.manager.SharedPreferencesManager

/**
 * Base class of Android app, containing components like Activities and Services.
 * Application or its sub classes are instantiated before all the activities or any other application
 * objects have been created in Android app.
 *
 * Author:  Zoltan Lorinczi
 * Date:    11/22/2021
 */
class App : Application() {

    companion object {
        lateinit var sharedPreferences: SharedPreferencesManager
    }

    override fun onCreate() {
        super.onCreate()
        sharedPreferences = SharedPreferencesManager(applicationContext)
    }
}