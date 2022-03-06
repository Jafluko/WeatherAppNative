package com.example.weatherappnative.viewcomponents

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import com.example.weatherappnative.R

/*
 * CardView for display City weather
 * */
@Composable
fun CityCardView(
    cityName: String,
    temperatureValue: String,
    favouritesEvent: () -> Unit,
    deleteEvent: () -> Unit
) {
    Card(
        elevation = R.dimen.elevation_card.dp,
        modifier = Modifier.padding(R.dimen.padding_card.dp)
    ) {
        Column {
            Row() {
                Text(text = cityName)
                Text(text = temperatureValue)
            }
            Divider()
            Row() {
                IconButton(onClick = favouritesEvent) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = R.string.favorite_description_card.toString()
                    )
                }
                IconButton(onClick = favouritesEvent) {
                    Icon(
                        imageVector = Icons.Filled.Delete,
                        contentDescription = R.string.delete_description_card.toString()
                    )
                }
            }
        }
    }
}

/*
 * CardView for weather in view City
 * */
@Composable
fun CardWeatherView(
    dataValue: String,
    iconWeather: ImageBitmap,
    temperatureValue: String
) {
    Card(
        elevation = R.dimen.elevation_card.dp,
        modifier = Modifier.padding(R.dimen.padding_card.dp)
    ) {
        Text(text = dataValue)
        Image(
            bitmap = iconWeather,
            contentDescription = R.string.description_icon_weather.toString()
        )
        Text(text = temperatureValue)
    }
}