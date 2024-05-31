package com.example.android_homework_14

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

const val BASE_URL = "https://randomuser.me"

interface SearchApi {
        @Headers(
            "Accept: application/json",
            "Content-type: application/json"
        )
        @GET("api")
        fun getPerson(): PersonModel
    }
