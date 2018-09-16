package com.example.senthil.kotlin_listview.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import com.example.senthil.kotlin_listview.Adapter.ListViewModelAdapter
import com.example.senthil.kotlin_listview.R
import com.example.senthil.kotlin_listview.Utils.Helper

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listView = findViewById<ListView>(R.id.sample_listVw)

        var listViewAdapter = ListViewModelAdapter(this, Helper.Companion.getListViewModelList())
        listView.adapter = listViewAdapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->

        }
    }
}
