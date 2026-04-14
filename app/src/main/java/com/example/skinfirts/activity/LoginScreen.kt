package com.example.skinfirts.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.skinfirts.R
import com.example.skinfirts.navigation.Screen
import com.example.skinfirts.ui.theme.appBlue
import com.example.skinfirts.ui.theme.fontSparatan
import com.example.skinfirts.ui.theme.outline_box_text
import com.example.skinfirts.ui.theme.outline_box_unselected_bc
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.serialization.Serializable


@Composable
fun loginScreen(navController: NavController){

    var passwordVisible by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(color = Color.White)
    }







    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .statusBarsPadding()
        .padding(start = 20.dp)
        .padding(top = 5.dp),
        horizontalAlignment = Alignment.Start,) {

        Row(modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,){

            Icon(painter = painterResource(id = R.drawable.blue_arrow1), contentDescription ="",tint = Color.Unspecified,
                modifier = Modifier
                    .size(24.dp)
                    .clickable {  })

            Box(modifier = Modifier
               .weight(1f),
               contentAlignment = Alignment.Center){
               Text(text = "Log In",
                   fontSize = 30.sp,
                   fontFamily = fontSparatan,
                   fontWeight = FontWeight.SemiBold,
                   color = appBlue)
           }
        }





        Spacer(modifier = Modifier
            .height(16.dp))

        Text(text = "Welcome",
            fontSize = 30.sp,
            fontFamily = fontSparatan,
            fontWeight = FontWeight.SemiBold,
            color = appBlue)





        Spacer(modifier = Modifier
            .height(8.dp))
        Text(text = "sjdffss.djkfsjdfsjdfskjdskdjfjdfsdjfftumljhdhadhjldjhsdjhsdjh",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth(.9f))






        Spacer(modifier = Modifier
            .fillMaxHeight(.08f))

        Text(text = "Email and Phone No:",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = Color.Black)
        OutlinedTextField(value = email,
            onValueChange = {email = it},
            placeholder = {
                Text(text = "example@example.com",
                    color = outline_box_text)

            },
            modifier = Modifier
                .fillMaxWidth(.95f),
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = outline_box_unselected_bc,
                focusedContainerColor = outline_box_unselected_bc,
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent
            ),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )








        Spacer(modifier = Modifier
            .height(10.dp))

        Text(text = "Password",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = Color.Black)
        OutlinedTextField(value = password,
            onValueChange = {password = it},
            placeholder = {
                Text(text = "*************",
                    color = outline_box_text)

            },
            modifier = Modifier
                .fillMaxWidth(.95f),
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = outline_box_unselected_bc,
                focusedContainerColor = outline_box_unselected_bc,
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent
            ),
            singleLine = true,
            visualTransformation = if(passwordVisible)
                VisualTransformation.None
            else
                PasswordVisualTransformation(),
            trailingIcon ={
                Icon(
                    painter = if(passwordVisible)
                        painterResource(id = R.drawable.open_eye)
                    else
                        painterResource(id = R.drawable.closed_eye),
                    contentDescription = "Toggle Password",
                    tint = Color.Gray,
                    modifier = Modifier.clickable {
                        passwordVisible = !passwordVisible
                    }
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )






        Row(modifier = Modifier
            .fillMaxWidth(.95f),
            horizontalArrangement = Arrangement.End){
            Text(text = "Forgot Password?",
                color = appBlue,
                fontFamily = fontSparatan,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                modifier = Modifier
                    .clickable {
                        navController.navigate(Screen.PasswordScreen.route) {
                            popUpTo(Screen.PasswordScreen.route) { inclusive = true }
                        }
                    })
        }





        Spacer(modifier = Modifier
            .height(20.dp))
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {},
                    colors = buttonColors(containerColor = appBlue),
                    modifier = Modifier
                        .fillMaxWidth(.45f)
                ) {
                    Text(text = "Log In",
                        fontFamily = fontSparatan,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium)
                }




                Spacer(modifier = Modifier
                    .height(10.dp))
                Text(text = "or sign up with",
                    fontFamily = fontSparatan,
                    fontSize = 14.sp)




                Spacer(modifier = Modifier
                    .height(10.dp))
                Row(modifier = Modifier
                    .fillMaxWidth(.4f)
                    ,horizontalArrangement = Arrangement.SpaceEvenly) {
                    Box(modifier = Modifier
                        .size(40.dp)
                        .clickable {  },
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.blue_circle), contentDescription = "")
                        Image(painter = painterResource(id = R.drawable.google_logo), contentDescription = "")
                    }






                    Box(modifier = Modifier
                        .size(40.dp)
                        .clickable {  },
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.blue_circle), contentDescription = "")
                        Image(painter = painterResource(id = R.drawable.facebook_logo), contentDescription = "")
                    }






                    Box(modifier = Modifier
                        .size(40.dp)
                        .clickable {  },
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.blue_circle), contentDescription = "")
                        Image(painter = painterResource(id = R.drawable.fingerprint_logo), contentDescription = "")
                    }
                }





                Spacer(modifier = Modifier
                    .fillMaxHeight(.12f))
                Row {
                    Text(text = "Don't have an account?",
                        fontSize = 14.sp,
                        fontFamily = fontSparatan,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black)
                    Text(
                        text = "Sign Up",
                        fontSize = 14.sp,
                        fontFamily = fontSparatan,
                        fontWeight = FontWeight.Medium,
                        color = appBlue,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(Screen.SignUpScreen.route) {
                                    popUpTo(Screen.SignUpScreen.route) { inclusive = true }
                                }
                            })
                }

            }
        }}
    }
