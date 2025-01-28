//Navigation.kt
package com.example.composeapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    //    Навигация
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            RegistrationUI(navController)
        }

        composable("gif") {
            WebViewUI(navController)
        }

        composable(route = "vars") {
            VarTesting(navController)
        }
    }
}