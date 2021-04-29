package com.example.viewpagertest2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.pager_item.view.*

class MyPagerAdapter : RecyclerView.Adapter<MyPagerAdapter.PagerViewHolder>() {

    class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    val data = Res.motorcycleList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        return PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.pager_item, parent, false))
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
       holder.itemView.apply {
           textViewItem.text = data[position].name
           Glide
               .with(this).load(data[position].imageId).into(imageViewItem)
       }
    }

    override fun getItemCount(): Int {
        return Res.motorcycleList.size
    }
}