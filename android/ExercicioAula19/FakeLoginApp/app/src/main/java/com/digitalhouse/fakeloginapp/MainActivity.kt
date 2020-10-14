package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCreateAccount.setOnClickListener {

            val intent = Intent(this,CadastroActivity::class.java)
            startActivity(intent)

        }

        btnLogin.setOnClickListener {

            this.verificarCamposNulos(edtLogin.text.toString(),edtPassword.text.toString())

            try {

                val response = UserService.logIn(edtLogin.text.toString(), edtPassword.text.toString())

                if (response != null) {

                    var intent = Intent(this, WelcomeActivity::class.java)

                    intent.putExtra("NAME", response.name.toString())

                    startActivity(intent)

                } else {

                    Toast.makeText(this, R.string.nonexistent_user, Toast.LENGTH_SHORT).show()

                }

            }catch (e:Exception){

                Toast.makeText(this,e.message,Toast.LENGTH_SHORT).show()

            }

        }

    }

    private fun verificarCamposNulos(email: String, password: String){

        if (email.isEmpty()) {

            edtLogin.error = getString(R.string.name_empty)

        } else if (password.isEmpty()) {

            edtPassword.error = getString(R.string.email_empty)

        }

    }

}