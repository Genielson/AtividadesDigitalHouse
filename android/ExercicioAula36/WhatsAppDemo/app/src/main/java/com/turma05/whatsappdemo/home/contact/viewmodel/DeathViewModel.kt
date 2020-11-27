package com.turma05.whatsappdemo.home.contact.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.turma05.whatsappdemo.home.contact.model.DeathModel
import com.turma05.whatsappdemo.home.contact.repository.DeathRepository
import com.turma05.whatsappdemo.home.status.repository.EpisodeRepository
import com.turma05.whatsappdemo.home.status.viewmodel.EpisodeViewModel
import kotlinx.coroutines.Dispatchers

class DeathViewModel (val repository: DeathRepository):ViewModel() {

    private var _deaths : List<DeathModel> = listOf()

    fun getDeaths() = liveData(Dispatchers.IO) {

        val response = repository.getDeaths()

        _deaths = response

        emit(response)

    }

    class DeathViewModelFactory(
        private val repository: DeathRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return DeathViewModel(repository) as T
        }
    }

}