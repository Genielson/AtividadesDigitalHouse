package com.turma05.whatsappdemo.home.contact.repository

import com.turma05.whatsappdemo.home.contact.model.DeathModel
import com.turma05.whatsappdemo.network.NetworkUtils
import retrofit2.http.GET

interface DeathEndpoint {

    @GET("deaths")
    suspend fun getDeaths() : List<DeathModel>

    companion object{
        val Endpoint : DeathEndpoint by lazy{ NetworkUtils.getRetrofit().create(DeathEndpoint::class.java)}
    }

}