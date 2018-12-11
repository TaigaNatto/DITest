package com.example.s04341.ditest.multiadapter_with_koin

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
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

    val inflater=LayoutInflater.from(context)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.layout_normal,viewGroup,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }

    // ViewHolder(固有ならインナークラスでOK)
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}