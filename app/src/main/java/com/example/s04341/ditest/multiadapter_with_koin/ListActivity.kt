package com.example.s04341.ditest.multiadapter_with_koin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.s04341.ditest.R
import org.koin.android.ext.android.inject

class ListActivity : AppCompatActivity() {

    private val normalItem: ItemContract by inject("normal")

    private val recyclerView:RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.recycler_view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val items= ArrayList<ItemContract>()
        items.add(normalItem)

        val multiAdapter=MultiAdapter(this,items)
        recyclerView.adapter=multiAdapter
    }
}
