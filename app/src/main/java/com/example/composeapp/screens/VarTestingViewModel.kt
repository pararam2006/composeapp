package com.example.composeapp.screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VarTestingViewModel: ViewModel() {
    var login: MutableLiveData<String> = MutableLiveData("")
    var password: MutableLiveData<String> = MutableLiveData("")
    var repeatedPassword: MutableLiveData<String> = MutableLiveData("")
    var mail: MutableLiveData<String> = MutableLiveData("")

}