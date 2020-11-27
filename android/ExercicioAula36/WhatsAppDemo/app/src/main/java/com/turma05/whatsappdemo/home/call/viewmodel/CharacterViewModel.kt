package com.turma05.whatsappdemo.home.call.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.turma05.whatsappdemo.home.call.model.CharacterModel
import com.turma05.whatsappdemo.home.call.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers

class CharacterViewModel(private val repository: CharacterRepository) : ViewModel(){

    private var _characters : List<CharacterModel> = listOf()

    fun obterLista() = liveData(Dispatchers.IO) {
        val response = repository.obterLista()
        _characters = response

        emit(_characters)
    }

    class CharacterViewModelFactory(
        private val repository: CharacterRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CharacterViewModel(repository) as T
        }
    }

}