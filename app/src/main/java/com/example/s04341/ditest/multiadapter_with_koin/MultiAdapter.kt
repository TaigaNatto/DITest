package com.example.s04341.ditest.multiadapter_with_koin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.s04341.ditest.R


class MultiAdapter(
    val context:Context,
    val items:ArrayList<ItemContract>
) : RecyclerView.Adapter<MultiAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, pos: Int): ViewHolder {
        return ViewHolder(items[pos])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }

    // ViewHolder(固有ならインナークラスでOK)
    inner class ViewHolder(item:ItemContract) : RecyclerView.ViewHolder(item.getView(context)) {

        var view:ItemContract=item

        init {

        }
    }
}