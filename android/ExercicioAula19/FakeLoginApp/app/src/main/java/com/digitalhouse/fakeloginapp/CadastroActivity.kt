package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btnLoginBack.setOnClickListener {
            finish()
        }

        chkRegister.setOnCheckedChangeListener { _, isChecked ->

            btnRegister.isEnabled = isChecked

        }

        btnRegister.setOnClickListener {

            var name = edtNameRegister.text.toString()
            var email = edtLoginRegister.text.toString()
            var password = edtPasswordRegister.text.toString()

            this.verificarCamposNulos(name,email,password)

            if(!(UserService.verificarUsuarioRepetido(email))) {

                try {

                    UserService.register(name, email, password)
                    Toast.makeText(this, R.string.user_registered_success, Toast.LENGTH_LONG).show()
                    finish()

                } catch (e: Exception) {

                    Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()

                }

            }else{

                Toast.makeText(this,R.string.email_already_registered, Toast.LENGTH_SHORT).show()

            }

        }

    }


    private fun verificarCamposNulos(name: String, email: String, password: String) {

        if (name.isEmpty()) {
            edtNameRegister.error = getString(R.string.name_empty)
        } else if (email.isEmpty()) {
            edtLoginRegister.error = getString(R.string.email_empty)
        } else if (password.isEmpty()) {
            edtPasswordRegister.error = getString(R.string.password_empty)
        }

    }

}