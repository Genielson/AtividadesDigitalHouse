package com.example.exerciciocalculaidadefragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_component_formulario.*
import kotlinx.android.synthetic.main.fragment_component_formulario.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ComponentFormulario.newInstance] factory method to
 * create an instance of this fragment.
 */
class ComponentFormulario : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var objClicado : IClicou

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var viewStart = inflater.inflate(R.layout.fragment_component_formulario, container, false)

        viewStart.containedButton.setOnClickListener {

            var nome = textFieldName.text.toString()

            var nascimento = textFieldNascimento.text.toString().toInt()

            if(nome.isEmpty()){
                Toast.makeText(context,"Preencha o campo Nome, por favor", Toast.LENGTH_SHORT).show()
            }else if(nascimento.equals("")){
                Toast.makeText(context,"Preencha sua idade, por favor",Toast.LENGTH_SHORT).show()
            }

            objClicado.clique(nome,nascimento)
        }

        return viewStart
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

        objClicado = context as IClicou
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ComponentFormulario.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ComponentFormulario().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}