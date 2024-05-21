package com.example.ecommer.screen.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommer.R
import com.example.ecommer.adapter.CartAdapter
import com.example.ecommer.adapter.categoryAdapter
import com.example.ecommer.databinding.FragmentCartBinding
import com.example.ecommer.models.CartItemDao


class cartFragment : Fragment(R.layout.fragment_cart) {

    private lateinit var binding: FragmentCartBinding
    private lateinit var adapter : CartAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentCartBinding.bind(view)

        super.onViewCreated(view, savedInstanceState)

        var cartList = ArrayList<CartItemDao>()


        cartList.add(
            CartItemDao(
                "12", "Arit", R.drawable.cat4,"12","$130","$40"
            )
        )
        cartList.add(
            CartItemDao(
                "12", "Arit", R.drawable.cat4,"12","$130","$40"
            )
        )
        cartList.add(
            CartItemDao(
                "12", "Arit", R.drawable.cat4,"12","$130","$40"
            )
        )
        cartList.add(
            CartItemDao(
                "12", "Arit", R.drawable.cat4,"12","$130","$40"
            )
        )


        binding.cartItemRcv1.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.cartItemRcv1.adapter = CartAdapter(cartList)
    }

}