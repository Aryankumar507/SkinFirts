package com.example.skinfirts.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomNavigationBar(navController: NavController.Companion) {
    val items = listOf(
        bottomNavItem.Home,
        bottomNavItem.Chats,
        bottomNavItem.Schedule
    )
    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                selected = true,
                onClick = {
                    navController.navigate(item.route) {

                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) }
            )
        }
    }
}



