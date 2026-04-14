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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
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

@Composable
fun signUpScreen(navController: NavController) {
    var passwordVisible by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var fullName by remember { mutableStateOf("") }
    var mobileNumber by remember { mutableStateOf("") }
    var dateOfBirth by remember { mutableStateOf("") }
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
                Text(text = "New Account",
                    fontSize = 30.sp,
                    fontFamily = fontSparatan,
                    fontWeight = FontWeight.SemiBold,
                    color = appBlue
                )
            }
        }

        Spacer(modifier = Modifier
            .height(16.dp))








        //Full Name
        Text(text = "Full name",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = Color.Black)
        OutlinedTextField(value = email,
            onValueChange = {email = it},
            placeholder = {
                Text(text = "example@example.com",
                    color = outline_box_text
                )

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
            .height(16.dp))




        // Password
        Text(text = "Password",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = Color.Black)
        OutlinedTextField(value = password,
            onValueChange = {password = it},
            placeholder = {
                Text(text = "*************",
                    color = outline_box_text
                )

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

        Spacer(modifier = Modifier
            .height(16.dp))







        // Email
        Text(text = "Email",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = Color.Black)
        OutlinedTextField(value = email,
            onValueChange = {email = it},
            placeholder = {
                Text(text = "example@example.com",
                    color = outline_box_text
                )

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

// Mobile Number
        Text(text = "Mobile Number",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = Color.Black)
        OutlinedTextField(value = mobileNumber,
            onValueChange = { if(it.length<=10 && it.all{char -> char.isDigit()}){
                mobileNumber = it
            }},
            placeholder = {
                Text(text = "example@example.com",
                    color = outline_box_text
                )

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
            .height(16.dp))






        // Date of Birth
        Text(text = "Date of Birth",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp)
        OutlinedTextField(value = dateOfBirth,
            onValueChange = {if(it.all{char -> char.isDigit() && it.length<=8}){
                dateOfBirth = it
                // Write The Logic for date of Birth
            }},
            placeholder = {
                Text(text = "DD/MM/YYYY",
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
            ))
        Spacer(modifier = Modifier
            .height(10.dp))







            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {



                Text(text = "By continuing you agree to"
                    ,fontFamily = fontSparatan,
                    fontSize = 14.sp)
                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    Text(text = "Terms of Use",
                        fontFamily = fontSparatan,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = appBlue,
                        modifier = Modifier
                            .clickable{

                                //Write The Logic for Terms for use

                            })
                    Spacer(modifier = Modifier
                        .width(5.dp))
                    Text(text = "and",
                        fontFamily = fontSparatan,
                        fontSize = 14.sp)
                    Spacer(modifier = Modifier
                        .width(5.dp))
                    Text(text = "Privacy Policy",
                        fontFamily = fontSparatan,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = appBlue,
                        modifier = Modifier
                            .clickable{

                                //Write The Logic for Privacy Policy

                            })
                }




                Button(
                    onClick = {

                        // Write The Logic for Login


                    },
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
                    Text(text = "already have an account?",
                        fontSize = 14.sp,
                        fontFamily = fontSparatan,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black)


                    Text(
                        text = "Log In",
                        fontSize = 14.sp,
                        fontFamily = fontSparatan,
                        fontWeight = FontWeight.Medium,
                        color = appBlue,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(Screen.LoginScreen.route) {
                                    popUpTo(Screen.LoginScreen.route) { inclusive = true }
                                }
                            })

                }

            }

    }
}
