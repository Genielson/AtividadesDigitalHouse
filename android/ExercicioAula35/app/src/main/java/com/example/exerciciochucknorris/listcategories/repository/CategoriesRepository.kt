package com.example.exerciciochucknorris.listcategories.repository

class CategoriesRepository {

    private val cliente = CategoriesEndpoint.endpoint

    suspend fun obterListaCategorias() = cliente.obterListaCategorias()

}