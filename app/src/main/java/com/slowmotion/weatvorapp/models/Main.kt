package com.slowmotion.weatvorapp.models

import com.google.gson.annotations.SerializedName

data class Main (
    @field:SerializedName("temp")
    val temp: Double,

    @field:SerializedName("feels_like")
    val feels_like: Double,

    @field:SerializedName("humidity")
    val humidity: Int,


        )