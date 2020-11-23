package com.example.exerciciochucknorris.joke.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciochucknorris.joke.repository.JokeRepository
import com.example.exerciciochucknorris.listcategories.repository.CategoriesRepository
import com.example.exerciciochucknorris.listcategories.viewmodel.CategoriesViewModel
import kotlinx.coroutines.Dispatchers

class JokeViewModel(private val repository: JokeRepository): ViewModel() {

    fun obterItemJoke(category: String) = liveData(Dispatchers.IO) {
        val response = repository.obterItemJoke(category)
        var joke = response
        emit(response)
    }

    class JokeViewModelFactory(private val repository: JokeRepository
    ): ViewModelProvider.Factory{

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return JokeViewModel(repository) as T
        }

    }
}