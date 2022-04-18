package com.ranzn.cleanarchit.app.persentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ranzn.cleanarchit.R
import com.ranzn.cleanarchit.app.data.model.ItemsItem
import com.ranzn.cleanarchit.app.persentation.listners.OnItemClick
import com.ranzn.cleanarchit.databinding.NestedItemLayoutBinding

class NestedRecyclerViewAdapter(private val list: List<ItemsItem?>, private val onItemClick: OnItemClick) :
    RecyclerView.Adapter<NestedRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedRecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NestedItemLayoutBinding.inflate(layoutInflater, parent, false)
        return NestedRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NestedRecyclerViewHolder, position: Int) {
        holder.setData(list[position], onItemClick)
    }

    override fun getItemCount(): Int = list.size


}

class NestedRecyclerViewHolder(private val binding: NestedItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun setData(item: ItemsItem?, onItemClick: OnItemClick) {
        binding.apply {
            tvItemName.text = item?.name
            Glide.with(ivItemImage).load(item?.thumbnailUrl).placeholder(R.drawable.ic_broken).into(ivItemImage)
            layout.setOnClickListener {
                onItemClick.onItemClick(item?.id!!)
            }
        }
    }
}