package com.turma05.whatsappdemo.home.status.repository

class EpisodeRepository {
    val client : EpisodeEndpoint = EpisodeEndpoint.Endpoint

    suspend fun getEpisodes() = client.getEpisodes()
}