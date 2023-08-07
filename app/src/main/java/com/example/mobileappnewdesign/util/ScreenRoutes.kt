package com.example.mobileappnewdesign.util

sealed class ScreenRoutes(
    val route: String
) {
    object SplashScreen: ScreenRoutes("splashScreen")
    object HomeScreen: ScreenRoutes("homeScreen")
//    object LoginScreen: ScreenRoute("loginScreen")
//    object SignupScreen: ScreenRoute("signupScreen")
//    object ScanScreen: ScreenRoute("scanScreen")
}