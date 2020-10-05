package com.example.exerciciocalculosalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular.setOnClickListener{

            var valorHora = campovalorHora.text.toString().toDouble()

            var horasTrabalhadas = campoHorasTrabalhada.text.toString().toDouble()


            txtResultado.text = getString(R.string.valor_resultado,"R$ "+(valorHora*horasTrabalhadas))


        }

    }
}