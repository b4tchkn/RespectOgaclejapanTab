package com.batch.respectogaclejapantab

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(fm: FragmentManager, private val context: Context): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> { return FirstFragment() }
            1 ->  { return SecondFragment() }
            else -> { return ThirdFragment() }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> { return "First" }
            1 ->  { return "Second" }
            else -> { return "Third" }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}