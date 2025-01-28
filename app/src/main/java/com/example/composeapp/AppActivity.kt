//AppActivity.kt
package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import com.example.composeapp.roomdb.UserRepository
//import com.example.composeapp.roomdb.UserRoomDatabase
import com.example.composeapp.screens.Nav
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics

class AppActivity : ComponentActivity() {
    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge() //Полноэкранный режим

        //Аналитика на https://console.firebase.google.com/u/0/project/composeapp-95435/crashlytics
        analytics = Firebase.analytics

        //Переменные БД
//        val userDb = UserRoomDatabase.getInstance(application)
//        val userDao = userDb.userDAO()
//        val repository: UserRepository = UserRepository(userDao)

        setContent {
            Nav()
        }
    }
}