package com.example.weatherappnative.di.modules

import com.example.weatherappnative.repositories.interfaces.ApiRetrofit
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Provides
    @Singleton
    fun getRetrofit(okHttpClient: OkHttpClient): ApiRetrofit =
        Retrofit.Builder()
            .baseUrl("api.openweathermap.org/data/2.5")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(okHttpClient)
            .build()
            .create(ApiRetrofit::class.java)

    @Provides
    fun getOkHttpClient(httpLoginInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(httpLoginInterceptor)
            .build()

    @Provides
    fun getHttpLoginIntercepror() =
        HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
}