package com.example.skinfirts.navigation


import android.R.attr.content
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.skinfirts.ui.theme.appBlue

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        bottomNavItem("Home", Icons.Default.Home, Screen.HomeScreen.route),
        bottomNavItem("Search", Icons.Default.Home, Screen.ChatScreen.route),
        bottomNavItem("Profile", Icons.Default.Home, Screen.ScheduleScreen.route)
    )
    val currentRoute = navController.currentBackStackEntry?.destination?.route
   Row(modifier = Modifier
       .padding(horizontal = 16.dp,vertical = 30.dp)
       .height(64.dp)
       .background(color = appBlue, shape = CircleShape),
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Center) {
        items.forEach { item->
            NavigationBarItem (selected = currentRoute == item.route,
                onClick = {
                      navController.navigate(item.route){
                          popUpTo(Screen.HomeScreen.route){
                              saveState = true
                          }
                          launchSingleTop = true
                          restoreState = true
                      }
                },
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.title)
                },
                colors = NavigationBarItemDefaults.colors(

                ))

            }
    }
}




