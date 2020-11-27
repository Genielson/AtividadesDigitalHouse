package com.turma05.whatsappdemo.home.contact.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.turma05.whatsappdemo.R
import com.turma05.whatsappdemo.home.contact.model.DeathModel
import com.turma05.whatsappdemo.home.status.model.EpisodeModel

class DeathAdapter(val dataSet: List<DeathModel>)  : RecyclerView.Adapter<DeathAdapter.DeathViewHolder>()  {



        class DeathViewHolder(view: View) : RecyclerView.ViewHolder(view){

            var titulo : TextView = view.findViewById(R.id.txtStatusTitle)

            var season : TextView = view.findViewById(R.id.txtStatusSeason)

            var episodeText : TextView = view.findViewById(R.id.txtStatusEpisode)

            fun bind(episode: DeathModel){

                titulo.text = episode.title
                season.text = episode.season
                episodeText.text = episode.episode

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeathViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
            return DeathViewHolder(view)
        }

        override fun getItemCount(): Int = dataSet.size

        override fun onBindViewHolder(holder: DeathViewHolder, position: Int) {
            holder.bind(dataSet[position])
        }

}