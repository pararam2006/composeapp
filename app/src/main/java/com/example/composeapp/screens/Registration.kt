//Registration.kt
package com.example.composeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composeapp.R
import com.example.composeapp.ui.theme.ComposeappTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationUI(navController: NavController) {

    val login = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val repeatedPassword = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    ComposeappTheme {
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            //Заголовок экрана
            Text(
                modifier = Modifier.padding(top = 120.dp, bottom = 30.dp),
                text = "Регистрация",
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif
            )

            //Логин
            OutlinedTextField(
                value = login.value,
                modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.small_padding)),
                placeholder = { Text(text = "Логин", color = Color.Gray) },
                onValueChange = { newText -> login.value = newText.trim()},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray
                )
            )

            //Пароль
            OutlinedTextField(
                value = password.value,
                modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.small_padding)),
                placeholder = { Text(text = "Пароль", color = Color.Gray) },
                onValueChange = {newText -> password.value = newText.trim()},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray
                )
            )
            //Повтор пароля
            OutlinedTextField(
                value = repeatedPassword.value,
                modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.small_padding)),
                placeholder = { Text(text = "Повторите пароль", color = Color.Gray) },
                onValueChange = {newText -> repeatedPassword.value = newText.trim()},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray
                ),
            )

            //Электронная почта
            OutlinedTextField(
                value = email.value,
                modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.small_padding)),
                placeholder = { Text(text = "Эл. почта", color = Color.Gray) },
                onValueChange = {newText -> email.value = newText.trim()},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Gray
                ),
            )

            //Кнопка регистрации
            //Ширина по полям ввода - 280.dp, по заголовку - 221.dp

//            Button(
//                modifier = Modifier
//                    .size(width = 221.dp, height = 50.dp)
//                    .padding(top = 10.dp),
//                onClick = {
//                    //Переход неясно куда?
//                    navController.navigate("gif")
//                }) {
//                Text(text = "Зарегистрироваться")
//            }

            Button(
                modifier = Modifier
                    .size(width = 221.dp, height = 50.dp)
                    .padding(top = 10.dp),
                onClick = {
                    //Переход на тестирование переменных
                    navController.navigate("vars")
                }) {
                Text(text = "К тесту переменных")
            }

            Button(
                modifier = Modifier
                    .size(width = 221.dp, height = 50.dp)
                    .padding(top = 10.dp),
                onClick = {
                    //Переход на тестирование переменных
                    navController.navigate("gif")
                }) {
                Text(text = "К гифке")
            }
        }
    }
}