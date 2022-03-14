package com.example.weatherappnative.models

data class WeatherModel(
    val coord: Coord,
    val weather: Weather
)

data class Weather(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

data class Wind(
    val speed: Float, // Wind speed meter/sec
    val deg: Float, // Wind direction, degrees (meteorological)
)

data class Coord(
    val longitude: Float,
    val latitude: Float
)