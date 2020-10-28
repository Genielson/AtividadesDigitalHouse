package com.example.whatsrecyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.minhaLista)

        var layoutM = LinearLayoutManager(this)

        var adaptador = MyAdapter(arrayListOf(
            Usuario("Genielson Leal","Oi tudo bom?","10:30"),
            Usuario("Felipe","Oi tudo bom?","12:30"),
            Usuario("Gabriel","Fala ai, blz?","12:30"),
            Usuario("Lucas","Opa, eai gente!","12:30"),
            Usuario("Davi","Salve gente!","12:30"),
            Usuario("Lara","UP!","12:30"),
            Usuario("Fernanda","Oiiii","12:30"),
            Usuario("Jessica","Oláaaa","12:30")

        ))

        recyclerView.apply{

            setHasFixedSize(true)

            layoutManager = layoutM

            adapter = adaptador

            addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))

        }


    }

}