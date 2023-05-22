package com.example.test


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Insta()
    }
    }
}
@OptIn(ExperimentalTextApi::class, ExperimentalMaterial3Api::class)
@Composable
fun Insta(){
    val gradientColors = listOf( Blue, Red /*...*/)
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var fullName by remember { mutableStateOf("") }
    var mobile by remember { mutableStateOf("") }

    Column( modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Instagram", style = TextStyle(
            brush = Brush.horizontalGradient(colors = gradientColors),
            fontSize = 40.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Start
            ))
        Text(text = "Sign up to see photos and videos from your friends.",
            style = TextStyle(
                brush = Brush.horizontalGradient(colors = gradientColors),
                fontSize =30.sp,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center
            ))
        Row() {
            Button(onClick = {  }, colors = ButtonDefaults.buttonColors( Blue) , modifier = Modifier.padding(30.dp)) {
                Image(painter = painterResource(id = R.drawable.img), contentDescription ="",
                modifier = Modifier.size(20.dp))
                Text(text = "  login with Facebook")
            }
            
        }
        Row() {
           Text(text = "---------------or-------------", style = TextStyle(
              /* brush = Brush.horizontalGradient(colors = gradientColors),*/
               fontSize =30.sp,
               fontFamily = FontFamily.Monospace,
               textAlign = TextAlign.Center
           ) ) 
        }
        Row() {
            OutlinedTextField(
                value = mobile,
                onValueChange = { mobile = it },
                label = { Text(text = "Mobile Number or Email") },
                modifier = Modifier.fillMaxWidth()
            )

        }
        Row() {
            OutlinedTextField(
                value = fullName,
                onValueChange = { fullName = it },
                label = { Text(text = "FullName") },
                modifier = Modifier.fillMaxWidth()
            )

        }
        Row() {
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text(text = "Username") },
                modifier = Modifier.fillMaxWidth()
            )

        }
        Row() {
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )
        }
        Text(text = buildAnnotatedString { append("People who use our service may have uploaded your contact information to Instagram.")
                                        withStyle(style = SpanStyle(color = Blue)){
                                            append(" Learn More")
                                        } } ,Modifier.padding(9.dp))
        Text(text = buildAnnotatedString { append("\n" +
                "By signing up, you agree to our ")
            withStyle(style = SpanStyle(color = Blue )){
                append("Terms , Privacy Policy ")
            }
            append(" and")
             withStyle(style = SpanStyle(color = Blue)){
                 append(" Cookies Policy .")
             }                            }
            ,Modifier.padding(10.dp))
        Row() {
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    ) {
                Text(text = "Sign in ")
            }
        }
    }
}

