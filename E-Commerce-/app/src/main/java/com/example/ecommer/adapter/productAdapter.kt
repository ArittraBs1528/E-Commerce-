package com.example.ecommer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommer.R
import com.example.ecommer.screen.adapter.productDao

class productAdapter(
    private val itemlist: ArrayList<productDao>,
    private val onClick: (productDao) -> Unit,
    private val onClickBtn: () -> Unit,
) :
    RecyclerView.Adapter<productAdapter.productViewHolder>() {


    inner class productViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val product_image: ImageView = itemView.findViewById(R.id.imageView6)
        val product_name: TextView = itemView.findViewById(R.id.textView3)
        val product_price: TextView = itemView.findViewById(R.id.priceTxt)
        val product_addBtn: ImageButton = itemView.findViewById(R.id.addBtn)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return productViewHolder(view)
    }


    override fun onBindViewHolder(holder: productViewHolder, position: Int) {
        holder.product_image.setImageResource(itemlist[position].image)
        holder.product_name.text = itemlist[position].productName
        holder.product_price.text = itemlist[position].productprice
        holder.itemView.setOnClickListener {
            onClick(itemlist[position])

        }
        holder.product_addBtn.setOnClickListener {
            onClickBtn()
        }


    }


    override fun getItemCount(): Int {
        return itemlist.size
    }


}