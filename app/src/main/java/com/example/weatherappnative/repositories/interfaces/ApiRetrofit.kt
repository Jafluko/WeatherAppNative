package com.example.weatherappnative.repositories.interfaces

import com.example.weatherappnative.models.Weather
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRetrofit {

    @GET("/weather")
    fun getWeatherNow(@Query("q") cityName: String): Deferred<Weather>

    @GET("/forecast/daily")
    fun getWeatherRange(@Query("q") cityName: String, @Query("cnt") numberDays: Int): Deferred<List<Weather>>
}