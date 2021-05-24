package com.example.projectoti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class Recyclerviewadapter (private val dataset:List<String>): RecyclerView.Adapter<Recyclerviewadapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val data: TextView =itemView.findViewById(R.id.datatext1)


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Recyclerviewadapter.ViewHolder {
        TODO("Not yet implemented")
    }



    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}