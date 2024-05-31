package com.example.android_homework_14

import com.google.gson.annotations.SerializedName

data class PersonModel(
    @SerializedName("gender") val gender: String,
    @SerializedName("email") val email: String
)
