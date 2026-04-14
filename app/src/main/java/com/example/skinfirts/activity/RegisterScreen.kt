package com.example.skinfirts.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.skinfirts.R
import com.example.skinfirts.navigation.Screen
import com.example.skinfirts.ui.theme.appBlue
import com.example.skinfirts.ui.theme.fontSparatan

@Composable
fun registerScreen(navController: NavController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = painterResource(id = R.drawable.blue_logo), contentDescription = "Register Screen")
        Spacer(modifier = Modifier
            .height(5.dp))
        Text(text = "Skin",
            color = appBlue,
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Normal,
            fontSize = 50.sp)

        Text(text = "Firts",
            color = appBlue,
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Normal,
            fontSize = 50.sp
        )
        Text(text = "Dermatology Center",
            color = appBlue,
            fontSize = 12.sp,
        )

        Spacer(modifier = Modifier
            .fillMaxHeight(.15f))

        Text(text = "akjhdfalkjdhfaljhdghdsgsdgfdhgfdsgijdgfjgisdujgisdgfkdjgsidgfsidgfisgfisudgid",
            modifier = Modifier
                .fillMaxWidth(.8f))
        Button(onClick = {
            navController.navigate(Screen.LoginScreen.route){
                popUpTo(Screen.LoginScreen.route) { inclusive = true }
            }
        },
            colors = buttonColors(containerColor = appBlue),
            modifier = Modifier
                .fillMaxWidth(.45f)
        ){
           Text(text = "Login",
               color = Color.White,
               fontSize = 20.sp)
        }
        Button(onClick = {
            navController.navigate(Screen.SignUpScreen.route){
                popUpTo(Screen.SignUpScreen.route){inclusive = true}
            }
        },
            colors = buttonColors(containerColor = appBlue),
            modifier = Modifier
                .fillMaxWidth(.45f)
        ){
            Text(text = "Sign Up",
                color = Color.White,
                fontSize = 20.sp)
        }

    }
}