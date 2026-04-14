package com.example.skinfirts.activity

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.skinfirts.navigation.BottomNavigationBar

@Composable
fun homeScreen(navController: NavController) {
    
   Scaffold(
       bottomBar = {
           BottomNavigationBar(navController)
   }

   ) {
       innerPadding ->
       Column(modifier = Modifier
           .padding(innerPadding)){

           Text(text = "Home Screen")
       }
   }


}