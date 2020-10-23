package com.example.recriandorickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.IRespostaDaApi
import com.digitalhouse.rickapp.api.Personagem
import com.digitalhouse.rickapp.api.RickApi

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.minhaLista)

        var layoutM = LinearLayoutManager(this)

        RickApi.getData(this,object:IRespostaDaApi{
            override fun obtevePersonagens(personagens: List<Personagem>) {

                var adaptador = MeuAdaptador(personagens)

                recyclerView.apply{

                    setHasFixedSize(true)

                    layoutManager = layoutM

                    adapter = adaptador

                }

            }

        })


    }


}