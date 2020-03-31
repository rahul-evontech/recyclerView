package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.MyMessages.*
import kotlinx.android.synthetic.main.list_view.view.*

class MyMessages(val message: ArrayList<String>,val context: Context): RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_view,parent,false))
    }

    override fun getItemCount(): Int {
        return message.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.text2?.text = message.get(position)
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val text2 = view.text2
    }


}


