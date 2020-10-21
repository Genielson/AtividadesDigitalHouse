package com.example.exerciciocalculaidadefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_componente_resultado.*
import java.util.*

class MainActivity : AppCompatActivity(), IClicou {


    var primeiroContainer = ComponentFormulario()

    var segundoContainer = ComponenteResultado()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.componentePrimario,primeiroContainer)
        transaction.commit()

        var transaction2 = supportFragmentManager.beginTransaction()
        transaction2.replace(R.id.componenteSecundario,segundoContainer)
        transaction2.commit()


    }

    override fun clique(nome: String, anoNascimento: Int) {

        var anoAtual = Calendar.getInstance().get(Calendar.YEAR)

        var idade = anoAtual - anoNascimento

        segundoContainer.txtResultado.text = "${nome}, voce tem ${idade} ano(s)"

    }
}