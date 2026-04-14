package com.example.skinfirts.navigation

sealed class Screen(val route: String){
    data object SplashScreen: Screen("splash_screen")
    data object LoginScreen: Screen("login_screen")
    data object LoginScreen1: Screen("login_screen1")
    data object RegisterScreen: Screen("register_screen")
    data object PasswordScreen: Screen("password_screen")
    data object HomeScreen: Screen("home_screen")
    data object SignUpScreen: Screen("sign_up_screen")
}
