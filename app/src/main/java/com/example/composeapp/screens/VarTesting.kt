//VarTesting.kt
package com.example.composeapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun VarTesting(navController: NavController, login: String = "default", password: String = "default", email: String = "default",) {
    Column(
        modifier = Modifier.fillMaxSize()) {
        //Логин
        Text(text = "Hi, ${login}", modifier = Modifier.padding(all = 10.dp))

        //Пароль
        Text(text = "Your password is ${password}", modifier = Modifier.padding(all = 10.dp))

        //Почта
        Text(text = "And your mail is ${email}", modifier = Modifier.padding(all = 10.dp))
    }
}