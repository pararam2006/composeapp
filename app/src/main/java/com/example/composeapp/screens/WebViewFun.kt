package com.example.composeapp.screens

import android.view.ViewGroup
import android.webkit.WebView
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController

@Composable
fun WebViewUI(navController: NavController){
    // Declare a string that contains a url
    val mUrl = "https://pararam2006.github.io/gifsite/"

    // Adding a WebView inside AndroidView
    // with layout as full screen
    AndroidView(factory = {
        WebView(it).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
    }, update = {
        it.loadUrl(mUrl)
    })
}