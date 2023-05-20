package com.example.test


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(all = 20.dp)
                    .fillMaxSize()
                    .background(color = Color.White)) {
                Image(painter = painterResource(id = R.drawable.img_1),
                    contentDescription =" " )
                Text(text = "User Name",
                    fontSize=30.sp,
                    color = Color.Black, )
                var abc by remember {
                    mutableStateOf(" ")
                }
                TextField(value = abc,
                    onValueChange = {abc=it})
                Text(text = " ", fontSize =30.sp )
                var abcd by remember {
                    mutableStateOf(" ")
                }
                Text(text = "Password",
                    fontSize =30.sp,
                    color = Color.Black )
                TextField(value = abcd,
                    onValueChange ={abcd=it} ,
                    visualTransformation =PasswordVisualTransformation())
                Text(text = " ", fontSize =30.sp )
               Row() {
                   Button(
                       onClick = {},
                       colors = ButtonDefaults.buttonColors(Color.Black),
                       shape = RoundedCornerShape(30.dp),
                   ) {
                       Text(text = "Submit")
                   }
                   Text(text = " ", fontSize =30.sp )
                   Button(onClick = {},
                       colors = ButtonDefaults.buttonColors(Color.Black),
                       shape = RoundedCornerShape(30.dp),) {
                       Text(text = "Back")
                   }
               }
                Row() {
                    Button(onClick = { },
                    colors = ButtonDefaults.buttonColors(Color.Black)) {
                        Image(painter = painterResource(id = R.drawable.img_1) ,
                            contentDescription ="Nobody",
                        modifier = Modifier.size(20.dp))
                        Text(text = "  login")
                    }
                }
            }
        }
    }
    }

