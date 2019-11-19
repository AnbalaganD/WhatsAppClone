package com.whatsapp.module.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class HomeTabAdapter(
    fragmentManager: FragmentManager,
    private val fragmentList: List<Fragment>,
    private val titleList: List<String>
) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = fragmentList.count()

    override fun getPageTitle(position: Int): CharSequence? = titleList[position]
}