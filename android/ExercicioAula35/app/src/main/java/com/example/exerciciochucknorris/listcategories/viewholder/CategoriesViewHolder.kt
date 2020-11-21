package com.example.exerciciochucknorris.listcategories.viewholder

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CategoriesViewHolder(private val lista:List<String>) : RecyclerView.Adapter<CategoriesViewHolder.MeuViewHolder>() {

    class MeuViewHolder(view: View):RecyclerView.ViewHolder(view){

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesViewHolder.MeuViewHolder {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder.MeuViewHolder, position: Int) {

    }


}