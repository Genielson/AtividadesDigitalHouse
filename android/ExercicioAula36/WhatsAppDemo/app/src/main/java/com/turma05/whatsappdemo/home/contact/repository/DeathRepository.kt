package com.turma05.whatsappdemo.home.contact.repository

class DeathRepository {
    val client = DeathEndpoint.Endpoint

    suspend fun getDeaths() = client.getDeaths()
}