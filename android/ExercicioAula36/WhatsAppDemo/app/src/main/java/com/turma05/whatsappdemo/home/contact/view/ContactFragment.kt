package com.turma05.whatsappdemo.home.contact.view

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
import com.turma05.whatsappdemo.home.contact.adapter.DeathAdapter
import com.turma05.whatsappdemo.home.contact.model.DeathModel
import com.turma05.whatsappdemo.home.contact.repository.DeathRepository
import com.turma05.whatsappdemo.home.contact.viewmodel.DeathViewModel
import com.turma05.whatsappdemo.home.status.adapter.EpisodeAdapterprivate
import com.turma05.whatsappdemo.home.status.model.EpisodeModel
import com.turma05.whatsappdemo.home.status.repository.EpisodeRepository
import com.turma05.whatsappdemo.home.status.viewmodel.EpisodeViewModel

class ContactFragment : Fragment() {

    private lateinit var _viewModel : DeathViewModel
    private lateinit var _listAdapter : DeathAdapter

    private  var _listDeath = mutableListOf<DeathModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewContact)
        var manager = LinearLayoutManager(view.context)
        _listAdapter = DeathAdapter(_listDeath)

        recyclerView.apply {

            setHasFixedSize(true)
            layoutManager = manager
            adapter = _listAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        _viewModel = ViewModelProvider(
            this, DeathViewModel.DeathViewModelFactory(
                DeathRepository()
            )
        ).get(DeathViewModel::class.java)

        _viewModel.getDeaths().observe(viewLifecycleOwner){
            exibirLista(it)
        }
    }

    private fun exibirLista(lista: List<DeathModel>) {

        lista.let {
            _listDeath.addAll(lista)
            _listAdapter.notifyDataSetChanged()
        }

    }
}