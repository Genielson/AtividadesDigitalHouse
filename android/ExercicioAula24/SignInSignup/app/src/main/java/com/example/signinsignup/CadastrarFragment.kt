package com.example.signinsignup

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_cadastrar.*
import kotlinx.android.synthetic.main.fragment_cadastrar.view.*
import kotlinx.android.synthetic.main.fragment_entrar.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CadastrarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CadastrarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var clique : IAlterarTab

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

        clique = context as IAlterarTab

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var viewReturn =  inflater.inflate(R.layout.fragment_cadastrar, container, false)

        viewReturn.btnSignupUser.isEnabled = false

        viewReturn.checkIagree.setOnCheckedChangeListener { _, isChecked ->

            viewReturn.btnSignupUser.isEnabled = isChecked

        }

        viewReturn.btnSignupUser.setOnClickListener {

            if(!verificaCampos(viewReturn)){

                viewReturn.findViewById<TextInputEditText>(R.id.textFieldEmailSignupContent).setText("")

                viewReturn.findViewById<TextInputEditText>(R.id.textFieldPasswordSignupContent).setText("")

                viewReturn.findViewById<TextInputEditText>(R.id.textFieldRepeatPasswordSignupContent).setText("")

            }

        }



        return viewReturn
    }

    private fun verificaCampos(viewReturn:View): Boolean {

        var campoEmail = viewReturn.findViewById<TextInputEditText>(R.id.textFieldEmailSignupContent)

        var campoSenha = viewReturn.findViewById<TextInputEditText>(R.id.textFieldPasswordSignupContent)

        var campoSenhaRepetida = viewReturn.findViewById<TextInputEditText>(R.id.textFieldRepeatPasswordSignupContent)

        var existeVazioOuSenhaDiferente = false

        if(campoEmail.text?.trim()!!.isEmpty()){

            campoEmail.error = getString(R.string.empty_email)

            existeVazioOuSenhaDiferente = true

        }

        if(campoSenha.text?.trim()!!.isEmpty()){

            campoSenha.error = getString(R.string.empty_password)

            existeVazioOuSenhaDiferente = true

        }

        if(campoSenhaRepetida.text?.trim()!!.isEmpty()){

            campoSenhaRepetida.error = getString(R.string.empty_password)

            existeVazioOuSenhaDiferente = true

        }

        if(campoSenha.text.toString() != campoSenhaRepetida.text.toString()){

            campoSenhaRepetida.error = getString(R.string.password_equals)

            existeVazioOuSenhaDiferente = true

        }

        return existeVazioOuSenhaDiferente

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CadastrarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CadastrarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}