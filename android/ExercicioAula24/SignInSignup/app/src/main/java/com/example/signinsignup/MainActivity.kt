package com.example.signinsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() , IAlterarTab{

    val tab by lazy {findViewById<TabLayout>(R.id.meuTabLayout)}

    val page by lazy {findViewById<ViewPager>(R.id.meuViewPage)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab.setupWithViewPager(page)

        page.adapter = MeuAdapter(listOf(EntrarFragment(),CadastrarFragment()), listOf(getString(R.string.sigin),getString(R.string.signup)),supportFragmentManager)


    }

    override fun alterarTab(fragmentEndereco: Int) {

         val SIGN_IN = 0
         val SIGN_UP = 1

        var posicaoAtual = if(fragmentEndereco == SIGN_IN){

            SIGN_UP

        }else{

            SIGN_IN

        }

        var outraTab = tab.getTabAt(posicaoAtual)

        outraTab?.select()


    }



}