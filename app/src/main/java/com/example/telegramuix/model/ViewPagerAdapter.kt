package com.example.telegramuix.model

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter: FragmentPagerAdapter {
    var fragments = ArrayList<Fragment>()
    constructor(fm:FragmentManager): super(fm)

    public fun add(fragment: Fragment){
        fragments.add(fragment)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }
}
