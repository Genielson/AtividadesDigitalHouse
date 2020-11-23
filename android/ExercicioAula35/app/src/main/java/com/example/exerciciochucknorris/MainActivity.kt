package com.example.exerciciochucknorris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciochucknorris.joke.view.JokeActivity
import com.example.exerciciochucknorris.listcategories.repository.CategoriesRepository
import com.example.exerciciochucknorris.listcategories.view.ListaCategoriesAdapter
import com.example.exerciciochucknorris.listcategories.viewmodel.CategoriesViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var _viewModel: CategoriesViewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.minhaListaCategorias)

        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        _viewModel = ViewModelProvider(this, CategoriesViewModel.CategoryViewModelFactory(CategoriesRepository())
        ).get(CategoriesViewModel::class.java)

        _viewModel.obterListaCategorias().observe(this, Observer{
            obterListaCategorias(it)
        })

    }

    fun obterListaCategorias(lista:List<String>){

        val manager = LinearLayoutManager(this)
        val adapterCategoria = ListaCategoriesAdapter(lista){

            var intent = Intent(this,JokeActivity::class.java)

            intent.putExtra("category",it)

            startActivity(intent)
        }

        recyclerView.apply{
            setHasFixedSize(true)
            layoutManager = manager
            adapter = adapterCategoria
        }

    }


}