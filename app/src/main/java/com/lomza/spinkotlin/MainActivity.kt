package com.lomza.spinkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (!AppPreferences.firstRun) {
            AppPreferences.firstRun = true
            Log.d("SpinKotlin", "The value of our pref is: ${AppPreferences.firstRun}")
        }
    }
}
