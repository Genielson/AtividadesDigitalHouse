package com.example.exerciciochucknorris.listcategories.repository

import com.example.exerciciochucknorris.data.NetworkUtils
import retrofit2.http.GET

interface CategoriesEndpoint {

    @GET("categories")
    suspend fun obterListaCategorias() : List<String>

    companion object{

        val endpoint : CategoriesEndpoint by lazy {
            NetworkUtils.getRetrofitInstance().create(CategoriesEndpoint::class.java)
        }

    }
}