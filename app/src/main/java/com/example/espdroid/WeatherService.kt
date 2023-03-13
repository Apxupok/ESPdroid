package com.example.espdroid

import retrofit2.Call
import retrofit2.http.GET

interface WeatherService {
    @GET("my-status")
    fun getCurrentWeatherData(): Call<WeatherResponse>
}