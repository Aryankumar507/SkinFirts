package com.example.skinfirts.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class bottomNavItem(
    val title:String,
    val icon: ImageVector,
    val route:String
){
    data object Home: bottomNavItem("Home", Icons.Default.Home,"home_screen")
    data object Chats: bottomNavItem("Chats", Icons.Default.Home,"chat_screen")
    data object Schedule: bottomNavItem("Schedule", Icons.Default.Home,"schedule_screen")
}
