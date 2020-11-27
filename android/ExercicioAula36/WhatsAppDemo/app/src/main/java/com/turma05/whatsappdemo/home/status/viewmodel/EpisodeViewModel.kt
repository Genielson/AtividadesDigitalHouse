package com.turma05.whatsappdemo.home.status.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.turma05.whatsappdemo.home.call.repository.CharacterRepository
import com.turma05.whatsappdemo.home.call.viewmodel.CharacterViewModel
import com.turma05.whatsappdemo.home.status.model.EpisodeModel
import com.turma05.whatsappdemo.home.status.repository.EpisodeRepository
import kotlinx.coroutines.Dispatchers

class EpisodeViewModel(val repository: EpisodeRepository):ViewModel() {

    var episodes : List<EpisodeModel> = listOf()

    fun getEpisodes() = liveData(Dispatchers.IO) {

        val response = repository.getEpisodes()
        episodes = response
        emit(response)
    }

    class EpisodeViewModelFactory(
        private val repository: EpisodeRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return EpisodeViewModel(repository) as T
        }
    }

}