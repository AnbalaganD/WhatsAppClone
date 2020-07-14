package com.whatsapp.module.home

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class HomeTabAdapter(
    private val fragmentList: List<Fragment>,
    private val titleList: List<String>
): RecyclerView.Adapter<HomeTabAdapter.TabHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = fragmentList.size

    override fun onBindViewHolder(holder: TabHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class TabHolder(binding: ViewDataBinding): RecyclerView.ViewHolder(binding.root) {

    }
}