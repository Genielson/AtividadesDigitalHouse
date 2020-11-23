package com.example.exerciciochucknorris.listcategories.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciochucknorris.R
import kotlinx.android.synthetic.main.item_categoria.view.*

class ListaCategoriesAdapter(private val lista:List<String> , private val listener : (String) -> Unit): RecyclerView.Adapter<ListaCategoriesAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View):RecyclerView.ViewHolder(view){

        var titulo:TextView = view.findViewById(R.id.itemListaCategoria)

        fun bind(category:String){

            titulo.text = category.capitalize()

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaCategoriesAdapter.MeuViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_categoria,parent,false)

        return MeuViewHolder(view)
    }

    override fun getItemCount(): Int = lista.size

    override fun onBindViewHolder(holder: ListaCategoriesAdapter.MeuViewHolder, position: Int) {
        var item = lista[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            listener(item)
        }

    }
}