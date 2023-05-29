package com.example.uiday4

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            App()

        }
    }
}

@Composable
fun App() {
    val showDialog = remember { mutableStateOf(false) }
    val showDialog1 = remember { mutableStateOf(false) }
    var res by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column {
        Button(
            onClick = {
                showDialog.value = true
                      res="one"
                      },
            modifier = androidx.compose.ui.Modifier.padding(16.dp)
        ) {
            Text(text = "One")
        }
        if (showDialog.value) {
            AlertDialog(
                onDismissRequest = { showDialog.value = false },
                title = { Text(text = "Alert Dialog") },
                text = { Text(text = "This is an alert dialog") },
                confirmButton = {
                    Button(
                        onClick = { Toast.makeText(context,"one",Toast.LENGTH_SHORT).show()  },
                        modifier = androidx.compose.ui.Modifier.padding(8.dp)
                    ) {
                        Text(text = "one")
                    }
                },
                modifier = androidx.compose.ui.Modifier.padding(16.dp)
            )
        }
        Button(
            onClick = {
                showDialog1.value = true
                res="two"
                      },
            modifier = androidx.compose.ui.Modifier.padding(16.dp)
        ) {
            Text(text = "TWO")
        }
        if (showDialog1.value) {
            AlertDialog(
                onDismissRequest = { showDialog1.value = false },
                title = { Text(text = "Alert Dialog") },
                text = { Text(text = "This is an alert dialog") },
                confirmButton = {
                    Button(
                        onClick = { Toast.makeText(context,"one",Toast.LENGTH_SHORT).show() },
                        modifier = androidx.compose.ui.Modifier.padding(8.dp)
                    ) {
                        Text(text = "one")
                    }
                },
                dismissButton = {
                                Button(onClick = { Toast.makeText(context,"Two",Toast.LENGTH_SHORT).show() },
                                    modifier = androidx.compose.ui.Modifier.padding(8.dp))
                                {
                                    Text(text = "Two")
                                }
                },
                modifier = androidx.compose.ui.Modifier.padding(16.dp)
            )
        }
        Text(text =res)
    }
}



