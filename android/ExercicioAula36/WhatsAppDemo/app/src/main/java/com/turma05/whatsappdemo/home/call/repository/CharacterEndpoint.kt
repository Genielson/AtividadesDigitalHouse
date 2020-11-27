package com.turma05.whatsappdemo.home.call.repository

import com.turma05.whatsappdemo.home.call.model.CharacterModel
import com.turma05.whatsappdemo.network.NetworkUtils
import retrofit2.http.GET

interface CharacterEndpoint {
    @GET("characters")
    suspend fun obterLista(): List<CharacterModel>

    companion object {
        val Endpoint: CharacterEndpoint by lazy {
            NetworkUtils.getRetrofit().create(CharacterEndpoint::class.java)
        }
    }


}
