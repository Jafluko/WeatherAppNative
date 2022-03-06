package com.example.weatherappnative.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.weatherappnative.ui.theme.WeatherAppNativeTheme

class CityViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppNativeTheme {

            }
        }
    }
}