package com.lomza.spinkotlin

import android.app.Application

/**
 * @author Antonina
 */
class SpInKotlinApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AppPreferences.init(this)
    }
}