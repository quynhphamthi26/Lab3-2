package com.example.recyclerview_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview_list.adapter.ItemAdapter
import com.example.recyclerview_list.data.Datasource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadAffirmations()
        recycler_view.adapter = ItemAdapter(this,myDataset)
        recycler_view.setHasFixedSize(true)
    }
}