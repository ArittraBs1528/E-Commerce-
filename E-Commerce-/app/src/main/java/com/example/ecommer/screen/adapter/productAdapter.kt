package com.example.ecommer.screen.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommer.R

 class productAdapter(private val itemlist: ArrayList<productDao>) :
    RecyclerView.Adapter<productAdapter.productViewHolder>() {

    private lateinit var myListener: MyClickListner

    class productViewHolder(itemView: View, clickListner: MyClickListner) :
        RecyclerView.ViewHolder(itemView) {

        val product_image: ImageView = itemView.findViewById(R.id.imageView6)
        val product_name: TextView = itemView.findViewById(R.id.textView3)
        val product_price: TextView = itemView.findViewById(R.id.priceTxt)

//        init {
//            itemView.setOnClickListener {
//                clickListner.onItemClick(adapterPosition)
//            }
//        }



    }

   open fun setItemClickListner(listner: MyClickListner) {
        myListener = listner
    }

    interface MyClickListner {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return productViewHolder(view, myListener)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: productViewHolder, position: Int) {
        holder.product_image.setImageResource(itemlist[position].image)
        holder.product_name.text = itemlist[position].productName
        holder.product_price.text = itemlist[position].productprice


    }


}