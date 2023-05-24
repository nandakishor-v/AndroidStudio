package com.example.zerodha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var res by remember {
                mutableStateOf(1)
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
            ) {
                Text(text = "Calculator", fontSize = 30.sp)


                var text1 by remember { mutableStateOf("") }
                TextField(
                    value = text1,
                    onValueChange = { text1 = it },
                    modifier = Modifier.padding(all = 10.dp)
                )


                var text2 by remember { mutableStateOf("") }

                TextField(
                    value = text2,
                    onValueChange = { text2 = it },
                    modifier = Modifier.padding(all = 10.dp)
                )
                Row() {
                    Button(onClick = {
                        res = text1.toInt() + text2.toInt()

                    }, modifier = Modifier.padding(all = 10.dp)) {
                        Text(text = "Addition", color = Color.Black)
                    }
                    Button(onClick = {
                        res = text1.toInt() - text2.toInt()

                    }, modifier = Modifier.padding(all = 10.dp)) {
                        Text(text = "Subtraction", color = Color.Black)
                    }
                }
                Row() {
                    Button(onClick = {
                        res = text1.toInt() * text2.toInt()
                    }, modifier = Modifier.padding(all = 10.dp)) {
                        Text(text = "Multiplication", color = Color.Black)
                    }
                    Button(onClick = {
                        res = text1.toInt() / text2.toInt()

                    }, modifier = Modifier.padding(all = 10.dp)) {
                        Text(text = "Division", color = Color.Black)
                    }
                }

                Text(text = "" + res)
            }
        }
    }
}