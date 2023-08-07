package com.example.mobileappnewdesign.screen

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.mobileappnewdesign.R
import com.example.mobileappnewdesign.ui.theme.BlueMain
import com.example.mobileappnewdesign.ui.theme.BlueSecond
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    context: Context,
    navigateToNextScreen:()->Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BlueMain)
    ){
        Image(
            painter = painterResource(R.drawable.logo_app),
            contentDescription = "logo App",
            modifier = Modifier
                .align(Alignment.Center)
        )
        LaunchedEffect(key1 = true) {
            delay(3000) // Menunggu 3 detik sebelum melanjutkan ke layar berikutnya
            navigateToNextScreen()
        }
    }
}