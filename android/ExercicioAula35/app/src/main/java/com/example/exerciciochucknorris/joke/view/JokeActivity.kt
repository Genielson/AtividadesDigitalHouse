package com.example.exerciciochucknorris.joke.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.exerciciochucknorris.R
import com.example.exerciciochucknorris.joke.model.JokeModel
import com.example.exerciciochucknorris.joke.repository.JokeRepository
import com.example.exerciciochucknorris.joke.viewmodel.JokeViewModel
import com.squareup.picasso.Picasso

class JokeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joke)

        var minhaviewModel = ViewModelProvider(
            this, JokeViewModel.JokeViewModelFactory(JokeRepository())).get(JokeViewModel::class.java)

        var categoria = intent.getStringExtra("category").toString()

        minhaviewModel.obterItemJoke(categoria).observe(this, Observer{
              inserirTextoEImagem(it)
        })

    }


     fun inserirTextoEImagem(resultado: JokeModel) {
         
        val piada = findViewById<TextView>(R.id.txtMessageJoke)
        val imagem = findViewById<ImageView>(R.id.imgJoke)
         piada.text = resultado.value
         Picasso.get().load(resultado.icon_url).into(imagem)
    }

}