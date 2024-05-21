package com.example.ecommer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommer.R

import com.example.ecommer.models.categoryDao

class categoryAdapter(
    private val itemList: ArrayList<categoryDao>,
    private val onClickItem: (categoryDao) -> Unit

) :
    RecyclerView.Adapter<categoryAdapter.categoryViewHolder>() {
    class categoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.findViewById(R.id.imageView)
        val text: TextView = itemView.findViewById(R.id.textViewCat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): categoryViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.category_card, parent, false)
        return categoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: categoryViewHolder, position: Int) {
        holder.image.setImageResource(itemList[position].image)
        holder.text.text = itemList[position].name

        holder.itemView.setOnClickListener {
            onClickItem(itemList[position])
        }
    }

}