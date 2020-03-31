package com.example.recyclerview

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val messages: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       button.setOnClickListener{
           val text1: String = editText.text.toString()
           add(text1)
       }

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = MyMessages(messages,this)
    }

    private fun add(text1: String) {
        messages.add(text1)
    }
}
