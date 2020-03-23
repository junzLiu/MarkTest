package com.mark.test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main.view.*

/*
 * @title 主页适配器
 * @author MarkLiu
 * @description 
 * @create 2020/3/18-11:09
*/

class MainAdapter(
    val context: Context,
    val data: MutableList<Entry>,
    val listener: OnItemClickListener
) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_main, null), listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.apply {
            entryTv.text = data[position].name
        }
    }

    var inflater: LayoutInflater = LayoutInflater.from(context)


    override fun getItemCount() = data.size


    class ViewHolder(itemView: View, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener { listener.onItemClickListener(layoutPosition, itemView) }
        }
    }
}