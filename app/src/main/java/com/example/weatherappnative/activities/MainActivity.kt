package com.example.weatherappnative.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.weatherappnative.R
import com.example.weatherappnative.ui.theme.WeatherAppNativeTheme
import com.example.weatherappnative.viewcomponents.FloatBtn

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppNativeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    WeatherAppNativeTheme {
                        MainView(this)
                    }
                }
            }
        }
    }
}

@Composable
fun MainView(context: Context) {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(title = { Text(text = stringResource(R.string.title_main_activity)) })
        },
        backgroundColor = MaterialTheme.colors.primary,
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatBtn(
                fabIcon = Icons.Default.Add,
                contentDescription = stringResource(R.string.description_fab)
            ) {
                //context.startActivity(Intent(context, CitySearchActivity::class.java))
            }
        }
    ) {

    }
}