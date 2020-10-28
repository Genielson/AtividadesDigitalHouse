package com.example.recriandorickapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class MeuAdaptador(private var listaPersonagem:List<Personagem>) : RecyclerView.Adapter<MeuAdaptador.MeuViewHolder>() {

    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var nome:TextView = view.findViewById(R.id.txtNome)

        private var status:TextView = view.findViewById(R.id.txtStatus)

        private var race:TextView = view.findViewById(R.id.txtRace)

        private var location:TextView = view.findViewById(R.id.txtLocation)

        private var imagemPerson:ImageView = view.findViewById(R.id.imgRickMorty)

        fun bind(personagem: Personagem) {

            loadImage(personagem)

            nome.text = personagem.nome

            status.text = personagem.status

            race.text = personagem.genero

            location.text = personagem.localizacao.nome

        }

        fun loadImage(personagem: Personagem){

            Picasso.get().load(personagem.imagemUrl).into(imagemPerson)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuAdaptador.MeuViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista,parent,false)

        return MeuViewHolder(view)

    }

    override fun onBindViewHolder(holder: MeuAdaptador.MeuViewHolder, position: Int) {

        holder.bind(listaPersonagem[position])

    }

    override fun getItemCount(): Int = listaPersonagem.size
}