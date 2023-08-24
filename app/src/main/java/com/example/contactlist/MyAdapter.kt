package com.example.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.databinding.ItemRecyclerviewBinding

class MyAdapter(val contactList:MutableList<ContactList>):RecyclerView.Adapter<MyAdapter.Holder>(){


    inner class Holder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root){
        val image = binding.image
        val name = binding.name
        val number = binding.number
        val like = binding.like
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.image.setImageResource(contactList[position].image)
        holder.name.text = contactList[position].name
        holder.number.text = contactList[position].number
        holder.like.setImageResource(contactList[position].like)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return  contactList.size
    }
}
