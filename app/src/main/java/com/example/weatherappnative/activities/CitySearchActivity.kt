package com.example.weatherappnative.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import com.example.weatherappnative.R
import com.example.weatherappnative.ui.theme.WeatherAppNativeTheme
import com.example.weatherappnative.viewcomponents.SimpleBtn

class CitySearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppNativeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FieldSearchCity(hintValue = "eeeee", changeEvent = {})
                    SimpleBtn(btnName = stringResource(id = R.string.name_btn_search)) {

                    }
                }
            }
        }
    }
}

@Composable
fun FieldSearchCity(hintValue: String, changeEvent: (TextFieldValue) -> Unit) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(value = text, onValueChange = changeEvent, label = { Text(text = hintValue) })
}