package com.turma05.whatsappdemo.home.status.repository

import com.turma05.whatsappdemo.home.status.model.EpisodeModel
import com.turma05.whatsappdemo.network.NetworkUtils
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface EpisodeEndpoint {

    @GET("episodes")
    suspend fun getEpisodes() : List<EpisodeModel>


    companion object{
        val Endpoint: EpisodeEndpoint by lazy {
            NetworkUtils.getRetrofit().create(EpisodeEndpoint::class.java)
        }
    }

}