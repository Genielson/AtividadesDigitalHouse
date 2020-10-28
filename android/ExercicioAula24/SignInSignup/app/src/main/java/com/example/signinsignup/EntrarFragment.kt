package com.example.signinsignup

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isEmpty
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.fragment_entrar.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EntrarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EntrarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var clicar : IAlterarTab

    override fun onAttach(context: Context) {
        super.onAttach(context)
        clicar = context as IAlterarTab
    }

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
        var viewReturn =  inflater.inflate(R.layout.fragment_entrar, container, false)

        viewReturn.btnLoginUser.setOnClickListener{

            if(!verificaCampos(viewReturn)){

                Toast.makeText(viewReturn.context,"Login with Success ",Toast.LENGTH_SHORT).show()

            }

        }

        viewReturn.btnSignupUserRegister.setOnClickListener {

            val SIGN_IN = 0

            clicar.alterarTab(SIGN_IN)
        }

        return viewReturn

    }

    private fun verificaCampos(minhaView : View): Boolean {

        var campoEmail = minhaView.findViewById<TextInputEditText>(R.id.textFieldEmailSigninContent)

        var campoSenha = minhaView.findViewById<TextInputEditText>(R.id.textFieldPasswordSigninContent)

        var existeVazio = false

        if(campoEmail.text?.trim()!!.isEmpty()){

            existeVazio = true

            campoEmail.error = getString(R.string.empty_email)


        }

        if(campoSenha.text?.trim()!!.isEmpty()){

            existeVazio = true

            campoSenha.error = getString(R.string.empty_password)

        }

        return existeVazio

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EntrarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EntrarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}