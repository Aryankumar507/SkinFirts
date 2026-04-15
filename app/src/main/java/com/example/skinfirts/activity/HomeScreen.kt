package com.example.skinfirts.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fitInside
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.skinfirts.R
import com.example.skinfirts.navigation.BottomNavigationBar
import com.example.skinfirts.ui.theme.appBlue
import com.example.skinfirts.ui.theme.fontSparatan
import com.example.skinfirts.ui.theme.outline_box_unselected_bc
import com.example.skinfirts.view_function.dateDay
import com.example.skinfirts.view_function.dateDayItem

@Composable
fun homeScreen(navController: NavController) {

    var search by remember { mutableStateOf("") }
    
   Scaffold(
       bottomBar = {
           BottomNavigationBar(navController)
   }

   ) {
       innerPadding ->
       Column(modifier = Modifier
           .padding(innerPadding)){
        Column(modifier = Modifier
            .padding(20.dp)){
            Row() {

                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "",
                    modifier = Modifier
                        .size(75.dp)
                        .clip(RoundedCornerShape(percent = 50)),
                    contentScale = ContentScale.Fit
                )
                Spacer(
                    modifier = Modifier
                        .width(5.dp)
                )

                Column(
                    modifier = Modifier
                        .height(75.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Text one",
                        fontFamily = fontSparatan,
                        color = appBlue
                    )
                    Text(text = "Text two",
                        fontFamily = fontSparatan,
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Box(modifier = Modifier, Alignment.Center) {
                        Image(
                            painter = painterResource(R.drawable.blue_circle),
                            contentDescription = ""
                        )
                        Image(
                            painter = painterResource(R.drawable.google_logo),
                            contentDescription = ""
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .width(10.dp)
                    )

                    Box(modifier = Modifier, Alignment.Center) {
                        Image(
                            painter = painterResource(R.drawable.blue_circle),
                            contentDescription = ""
                        )
                        Image(
                            painter = painterResource(R.drawable.google_logo),
                            contentDescription = ""
                        )
                    }
                }


        }


           Row(modifier = Modifier
               .fillMaxWidth(),
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically){
               Image(painter = painterResource(R.drawable.google_logo), contentDescription = "")
               Spacer(modifier = Modifier
                   .width(30.dp))
               Image(painter = painterResource(R.drawable.google_logo), contentDescription = "")
               Spacer(modifier = Modifier
                   .width(30.dp))
               Box(modifier = Modifier
                   .fillMaxWidth()
                   .background(color = outline_box_unselected_bc, shape = RoundedCornerShape(percent = 50))){


               Row(modifier = Modifier
                   .fillMaxWidth(),
                   horizontalArrangement = Arrangement.Center,
                   verticalAlignment = Alignment.CenterVertically){
                   Image(painter = painterResource(R.drawable.google_logo), contentDescription = "")

                   OutlinedTextField(value = search, onValueChange = {search = it},
                   modifier = Modifier
                       .fillMaxWidth(.8f),
                   placeholder = {
                       Text(text = "Search")
                   },
                   shape = RoundedCornerShape(percent = 50),
                   colors = OutlinedTextFieldDefaults.colors(
                       unfocusedContainerColor = outline_box_unselected_bc,
                       focusedContainerColor = outline_box_unselected_bc,
                       unfocusedBorderColor = Color.Transparent,
                       focusedBorderColor = Color.Transparent
                   )
                   )

                   Image(painter = painterResource(R.drawable.google_logo), contentDescription = "")



               }

               }
           }
        }

           Spacer(modifier = Modifier
               .padding(vertical = 10.dp))

           Column(modifier = Modifier
               .background(color = outline_box_unselected_bc)
               .padding(10.dp)){

               val dditems =
                   listOf(
                       dateDayItem("1","Mon"),
                       dateDayItem("2","Tue"),
                       dateDayItem("3","Wed"),
                       dateDayItem("4","Thu"),
                       dateDayItem("5","Fri"),
                       dateDayItem("6","Sat"),
                       dateDayItem("7","Sun"),
                       dateDayItem("8","Mon"),
                       dateDayItem("9","Tue"),
                       dateDayItem("10","Wed"),
                       dateDayItem("11","Thu"),
                       dateDayItem("12","Fri"),
                       dateDayItem("13","Sat"),
                       dateDayItem("14","Sun"),
                       dateDayItem("15","Mon"),
                   )

               var selectedIndex by remember {mutableStateOf(0)}
               var date by remember { mutableStateOf("") }
               var day by remember { mutableStateOf("") }

               date = dditems[selectedIndex].date
               day = dditems[selectedIndex].day


               LazyRow(modifier = Modifier){
                  itemsIndexed(dditems) { index,item->
                      Box(modifier = Modifier.padding(10.dp)){
                          dateDay(
                              item = item,
                              isSelected = index == selectedIndex,
                              onClick = {
                                  selectedIndex = index
                                  date = item.date
                                  day = item.day
                              }
                          )
                  }
                   }
               }
               Column(
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(16.dp)
                       .background(Color.White, shape = RoundedCornerShape(20.dp))
                       .padding(16.dp)
               ){
                   Text(
                       text = "${date} ${day} - Today",
                       modifier = Modifier.align(Alignment.End),
                       color = appBlue
                   )

                   Spacer(modifier = Modifier.height(10.dp))

                   Row(modifier = Modifier,
                       verticalAlignment = Alignment.CenterVertically){
                       Column{
                           Text("9 AM")
                           Spacer(modifier = Modifier.height(10.dp))
                           Text("10 AM")
                           Spacer(modifier = Modifier.height(10.dp))
                           Text("11 AM")
                           Spacer(modifier = Modifier.height(10.dp))
                           Text("12 AM")

                       }
                       Spacer(modifier = Modifier.width(10.dp))

                       Box(modifier = Modifier
                           .background(appBlue.copy(alpha = 0.2f), shape = RoundedCornerShape(16.dp))
                           .padding(12.dp)){
                           Column(modifier = Modifier
                               .fillMaxWidth(.9f)){
                               Text("Dr. Aryan Kumar",color = appBlue)
                               Text("Skin Care")
                           }
                       }
                   }
               }
           }
       }
   }


}