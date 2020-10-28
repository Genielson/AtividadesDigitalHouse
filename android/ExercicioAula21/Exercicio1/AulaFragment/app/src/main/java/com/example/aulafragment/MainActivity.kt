package com.example.aulafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmento = BlankFragment()
        val outrofragment  = BlankFragment2()


        idButton.setOnClickListener {

            addFragment(fragmento)

        }

        idButton2.setOnClickListener {


            addFragment(outrofragment)

        }



    }

    fun addFragment(fragment:Fragment){

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()


    }

}