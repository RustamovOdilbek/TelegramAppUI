package com.example.telegramuix.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.telegramuix.R
import com.example.telegramuix.fragment.AppearanceFragment
import com.example.telegramuix.fragment.ContactFragment
import com.example.telegramuix.fragment.NotificationsFragment
import com.example.telegramuix.model.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    var viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    fun initViews(){
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        viewPagerAdapter.add(ContactFragment())
        viewPagerAdapter.add(NotificationsFragment())
        viewPagerAdapter.add(AppearanceFragment())

        viewPager.adapter = viewPagerAdapter
    }
}