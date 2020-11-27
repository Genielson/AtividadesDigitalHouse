package com.turma05.whatsappdemo.home.status.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.turma05.whatsappdemo.R
import com.turma05.whatsappdemo.home.call.adapter.CharacterViewHolder
import com.turma05.whatsappdemo.home.call.model.CharacterModel
import com.turma05.whatsappdemo.home.status.model.EpisodeModel
import kotlinx.android.synthetic.main.item_status.*

class EpisodeAdapterprivate (val dataSet: List<EpisodeModel>) :
RecyclerView.Adapter<EpisodeAdapterprivate.EpisodeViewHolder>() {

    class EpisodeViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var titulo : TextView = view.findViewById(R.id.txtStatusTitle)

        var season : TextView = view.findViewById(R.id.txtStatusSeason)

        var episodeText : TextView = view.findViewById(R.id.txtStatusEpisode)

        fun bind(episode:EpisodeModel){

            titulo.text = episode.title
            season.text = episode.season
            episodeText.text = episode.episode

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_status, parent, false)
        return EpisodeViewHolder(view)
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

}