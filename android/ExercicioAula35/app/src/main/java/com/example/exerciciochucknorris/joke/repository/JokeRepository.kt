package com.example.exerciciochucknorris.joke.repository

import com.example.exerciciochucknorris.listcategories.repository.CategoriesEndpoint.Companion.endpoint

class JokeRepository {
    private val client = JokeEndpoint.endpoint
    suspend fun obterItemJoke(category: String) = client.obterItemJoke(category)
}