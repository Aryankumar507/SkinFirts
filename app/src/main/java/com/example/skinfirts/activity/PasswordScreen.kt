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
fun passwordScreen(navController: NavController) {

    var passwordVisible by remember { mutableStateOf(false) }
    var confirmPasswordVisible by remember { mutableStateOf(false) }
    var confirmPassword by remember { mutableStateOf("") }
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
                Text(text = "Set Password",
                    fontSize = 30.sp,
                    fontFamily = fontSparatan,
                    fontWeight = FontWeight.SemiBold,
                    color = appBlue)
            }
        }





        Spacer(modifier = Modifier
            .height(16.dp))



        Text(text = "sjdffss.djkfsjdfsjdfskjdskdjfjdfsdjfftumljhdhadhjldjhsdjhsdjh",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth(.9f))






        Spacer(modifier = Modifier
            .fillMaxHeight(.05f))


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








        Spacer(modifier = Modifier
            .height(15.dp))

        Text(text = "Confirm Password",
            fontFamily = fontSparatan,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = Color.Black)
        OutlinedTextField(value = confirmPassword,
            onValueChange = {confirmPassword = it},
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
            visualTransformation = if(confirmPasswordVisible)
                VisualTransformation.None
            else
                PasswordVisualTransformation(),
            trailingIcon ={
                Icon(
                    painter = if(confirmPasswordVisible)
                        painterResource(id = R.drawable.open_eye)
                    else
                        painterResource(id = R.drawable.closed_eye),
                    contentDescription = "Toggle Password",
                    tint = Color.Gray,
                    modifier = Modifier.clickable {
                        confirmPasswordVisible = !confirmPasswordVisible
                    }
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )




        Spacer(modifier = Modifier
            .fillMaxHeight(.07f))


        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Button(
                onClick = {

                    //navigation to login screen
                },
                colors = buttonColors(containerColor = appBlue),
                modifier = Modifier
                    .fillMaxWidth(.7f)
            ) {
                Text(text = "Create New Password",
                    fontFamily = fontSparatan,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium)
            }


        }
        }


}