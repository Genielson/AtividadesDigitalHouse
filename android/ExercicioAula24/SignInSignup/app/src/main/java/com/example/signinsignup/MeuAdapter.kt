package com.example.signinsignup

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MeuAdapter(val listaFragment : List<Fragment>, val listTitulo : List<String>, manager : FragmentManager) : FragmentPagerAdapter(manager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment = listaFragment[position]

    override fun getCount(): Int = listaFragment.size

    override fun getPageTitle(position: Int): CharSequence? = listTitulo[position]

}