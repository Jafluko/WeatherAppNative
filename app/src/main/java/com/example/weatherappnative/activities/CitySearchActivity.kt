package com.example.weatherappnative.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue
import com.example.weatherappnative.ui.theme.WeatherAppNativeTheme

class CitySearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppNativeTheme {

            }
        }
    }
}

@Composable
fun FieldSearchCity(hintValue: String, changeEvent: (TextFieldValue) -> Unit) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(value = text, onValueChange = changeEvent, label = { Text(text = hintValue) })
}