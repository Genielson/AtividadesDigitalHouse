package com.example.exercicioconversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTemperatura.setOnClickListener{

            var temperaturaCelsius = ((campoTemperatura.text.toString().toDouble() * 9)/5) + 32

            txtTemperatura.text = getString(R.string.resultado_temperatura,temperaturaCelsius.toString()+" °F ")

        }
    }
}