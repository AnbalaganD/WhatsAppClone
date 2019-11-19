package com.whatsapp.module.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.whatsapp.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragmentList = arrayListOf(Fragment(), Fragment(), Fragment())
        val fragmentTitles = arrayListOf("CHATS", "STATUS", "CALLS")
        val adapter = HomeTabAdapter(supportFragmentManager, fragmentList, fragmentTitles)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}