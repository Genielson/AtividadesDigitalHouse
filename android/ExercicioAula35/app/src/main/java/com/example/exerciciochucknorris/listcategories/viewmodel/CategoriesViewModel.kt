package com.example.exerciciochucknorris.listcategories.viewmodel

import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciochucknorris.listcategories.repository.CategoriesRepository
import kotlinx.coroutines.Dispatchers

class CategoriesViewModel(private var repository: CategoriesRepository):ViewModel() {

    var itemJoke = listOf<String>()

    fun obterListaCategorias() = liveData<List<String>>(Dispatchers.IO){

        val response = repository.obterListaCategorias()

        var listaCategorias = response

        emit(response)

    }


    class CategoryViewModelFactory(private val repository: CategoriesRepository
    ): ViewModelProvider.Factory{

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CategoriesViewModel(repository) as T
        }

    }

}