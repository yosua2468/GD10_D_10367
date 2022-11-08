package com.example.gd10_d_10367

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

object RClient {
    private const val BASE_URL = "http://192.168.58.170/ci4-apiserver/public/"
    val instances:api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }

}