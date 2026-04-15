package com.example.skinfirts.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.skinfirts.activity.ScheduleScreen
import com.example.skinfirts.activity.chatScreen
import com.example.skinfirts.activity.contactScreen
import com.example.skinfirts.activity.homeScreen
import com.example.skinfirts.activity.loginScreen
import com.example.skinfirts.activity.loginScreen1
import com.example.skinfirts.activity.passwordScreen
import com.example.skinfirts.activity.registerScreen
import com.example.skinfirts.activity.signUpScreen
import com.example.skinfirts.activity.splashScreen
@Composable
fun appNavigation(modifier: Modifier){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route){

        composable(route = Screen.SplashScreen.route){
            splashScreen(navController)
        }
        composable(route = Screen.LoginScreen.route){
            loginScreen(navController)
        }
        composable(route = Screen.HomeScreen.route){
            homeScreen(navController)
        }
        composable(route = Screen.ChatScreen.route){
            chatScreen(navController)
        }
        composable(route = Screen.ScheduleScreen.route){
            ScheduleScreen(navController)
        }
        composable(route = Screen.LoginScreen1.route){
            loginScreen1(navController)
        }
        composable(route = Screen.RegisterScreen.route){
            registerScreen(navController)
        }
        composable(route = Screen.PasswordScreen.route){
            passwordScreen(navController)
        }
        composable(route = Screen.SignUpScreen.route) {
            signUpScreen(navController)
        }
        composable ( route = Screen.ContactScreen.route ){
            contactScreen(navController)
        }
        }
}
