package com.example.exerciciochucknorris.listcategories.repository

import com.example.exerciciochucknorris.data.NetworkUtils
import retrofit2.http.GET

interface CategoriesEndpoint {

    @GET("categories")
    suspend fun obterListaCategorias() : List<String>

    companion object{

        const val  BASE_URL:String = "https://api.chucknorris.io/jokes/"

        val endpoint : CategoriesEndpoint by lazy {
            NetworkUtils.getRetrofitInstance(BASE_URL).create(CategoriesEndpoint::class.java)
        }

    }
}