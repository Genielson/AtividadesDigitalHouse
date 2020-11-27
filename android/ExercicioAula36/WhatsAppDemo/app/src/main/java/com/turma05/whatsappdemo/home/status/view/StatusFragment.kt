package com.turma05.whatsappdemo.home.status.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.turma05.whatsappdemo.R
import com.turma05.whatsappdemo.home.call.model.CharacterModel
import com.turma05.whatsappdemo.home.call.repository.CharacterRepository
import com.turma05.whatsappdemo.home.call.viewmodel.CharacterViewModel
import com.turma05.whatsappdemo.home.status.adapter.EpisodeAdapterprivate
import com.turma05.whatsappdemo.home.status.model.EpisodeModel
import com.turma05.whatsappdemo.home.status.repository.EpisodeRepository
import com.turma05.whatsappdemo.home.status.viewmodel.EpisodeViewModel

class StatusFragment : Fragment() {

    private lateinit var _viewModel : EpisodeViewModel
    private lateinit var _listAdapter : EpisodeAdapterprivate

    private  var _listEpisodes = mutableListOf<EpisodeModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewStatus)

        var manager = LinearLayoutManager(view.context)

        _listAdapter = EpisodeAdapterprivate(_listEpisodes)

        recyclerView.apply {

            setHasFixedSize(true)
            layoutManager = manager
            adapter = _listAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        _viewModel = ViewModelProvider(
            this, EpisodeViewModel.EpisodeViewModelFactory(
                EpisodeRepository()
            )
        ).get(EpisodeViewModel::class.java)

        _viewModel.getEpisodes().observe(viewLifecycleOwner){
                exibirLista(it)
        }

    }

    private fun exibirLista(lista: List<EpisodeModel>) {

        lista.let {
            _listEpisodes.addAll(lista)
            _listAdapter.notifyDataSetChanged()
        }

    }
}