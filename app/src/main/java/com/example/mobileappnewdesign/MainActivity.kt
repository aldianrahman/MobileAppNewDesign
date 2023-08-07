package com.example.mobileappnewdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobileappnewdesign.screen.HomeScreen
import com.example.mobileappnewdesign.screen.SplashScreen
import com.example.mobileappnewdesign.ui.theme.MobileAppNewDesignTheme
import com.example.mobileappnewdesign.util.ScreenRoutes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileAppNewDesignTheme {
                val context = LocalContext.current
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = ScreenRoutes.SplashScreen.route
                ){

                    composable(ScreenRoutes.SplashScreen.route){
                        SplashScreen(context){
                            navController.navigate(ScreenRoutes.HomeScreen.route)
                        }
                    }

                    composable(ScreenRoutes.HomeScreen.route){
                        HomeScreen(context)
                    }
                }

            }
        }
    }
}



