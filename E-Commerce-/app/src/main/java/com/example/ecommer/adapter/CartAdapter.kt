package com.example.ecommer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommer.R
import com.example.ecommer.models.CartItemDao

class CartAdapter(
    var items : ArrayList<CartItemDao>
): RecyclerView.Adapter<CartAdapter.CartViewHolder>(){
    class CartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var cartItemName = itemView.findViewById<TextView>(R.id.cartItemName)
        var cartItemPrice = itemView.findViewById<TextView>(R.id.cartItemPrice)
        var cartDiscount = itemView.findViewById<TextView>(R.id.cartItemDiscountPrice)
        var itemColor = itemView.findViewById<TextView>(R.id.itemColor)
        var itemImage = itemView.findViewById<ImageView>(R.id.cartImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(view)
    }

    override fun getItemCount(): Int {
      return items.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {

        holder.cartItemName.text = items[position].productName
        holder.cartItemPrice.text = items[position].originalPrice
        holder.cartDiscount.text = items[position].discountPrice
        holder.itemImage.setImageResource(items[position].productimage)
    }
}