package com.example.assignment_first.activity.services

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {

    @GET(" top-headlines")
    fun getNewsHeadlines() :Call<HeadLines>

}