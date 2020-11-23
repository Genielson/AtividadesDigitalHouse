package com.example.exerciciochucknorris.joke.repository

import com.example.exerciciochucknorris.data.NetworkUtils
import com.example.exerciciochucknorris.joke.model.JokeModel
import retrofit2.http.GET
import retrofit2.http.Query

interface JokeEndpoint {

    @GET("random")
    suspend fun obterItemJoke(@Query("category") category: String?): JokeModel

    companion object {
        val endpoint: JokeEndpoint by lazy {
            NetworkUtils.getRetrofitInstance().create(JokeEndpoint::class.java)
        }
    }

}