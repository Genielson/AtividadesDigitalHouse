package com.example.whatsrecyclerview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var usuarios:List<Usuario>) : RecyclerView.Adapter<MyAdapter.MeuViewHolder>() {


    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var nome:TextView = view.findViewById(R.id.txtNomeUsuario)

        private var mensagem:TextView = view.findViewById(R.id.conversaUserId)

        private var horas:TextView = view.findViewById(R.id.horarioConversaId)

        fun bind(usuario: Usuario) {

            nome.text = usuario.nome

            mensagem.text = usuario.textos

            horas.text = usuario.horas

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista,parent,false)

        return MeuViewHolder(view)

    }

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {

        holder.bind(usuarios[position])

    }

    override fun getItemCount(): Int = usuarios.size

}