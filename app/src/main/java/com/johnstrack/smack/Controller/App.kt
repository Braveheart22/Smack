package com.johnstrack.smack.Controller

import android.app.Application
import com.johnstrack.smack.Utilities.SharedPrefs

/**
 * Created by John on 4/25/2018 at 4:57 PM.
 */
class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }

}