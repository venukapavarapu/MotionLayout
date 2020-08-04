package com.venu.motionlayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(val context : Context) : RecyclerView.Adapter<viewHolder>() {

    var data = mutableListOf<String>("venu","venun","venu","gdgcy","venu","venun","venu","gdgcy")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder =
        viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_item,parent,false))

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

    }

}

class viewHolder(val view : View) : RecyclerView.ViewHolder(view){

}