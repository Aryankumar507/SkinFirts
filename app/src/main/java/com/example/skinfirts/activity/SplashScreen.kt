package com.example.skinfirts.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.skinfirts.R
import com.example.skinfirts.navigation.Screen
import com.example.skinfirts.ui.theme.appBlue
import com.example.skinfirts.ui.theme.fontSparatan
import kotlinx.coroutines.delay

@Composable
fun splashScreen(navController: NavController){

    LaunchedEffect(Unit) {

        delay(1000)
        val destination = if(true){
            Screen.HomeScreen.route
        }else{
            Screen.LoginScreen.route
        }

        navController.navigate(destination){
            popUpTo(Screen.SplashScreen.route) { inclusive = true }
        }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = appBlue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Splash Image")
        Spacer(modifier = Modifier
            .height(5.dp))
        Text(text = "Skin",
            color = Color.White,
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Thin,
            fontSize = 50.sp)

        Text(text = "Firts",
            color = Color.White,
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Thin,
            fontSize = 50.sp
            )
        Text(text = "Dermatology Center",
            color = Color.White,
            fontSize = 12.sp,
            )
    }
}