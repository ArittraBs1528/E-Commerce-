package com.example.ecommer.screen.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.ecommer.R
import com.example.ecommer.databinding.FragmentHomefregmentBinding
import com.example.ecommer.databinding.FragmentProductListFregementBinding
import com.example.ecommer.screen.adapter.productAdapter
import com.example.ecommer.screen.adapter.productDao
import com.example.ecommer.screen.models.categoryDao


class productListFregement : Fragment(R.layout.fragment_product_list_fregement) {

    private lateinit var binding: FragmentProductListFregementBinding
    private lateinit var adapter: productAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_list_fregement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentProductListFregementBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        var productList = addProductList()
        binding.proListRcv1.setHasFixedSize(true)
        binding.proListRcv1.layoutManager =
            StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        binding.proListRcv1.adapter = productAdapter(productList, {
            Toast.makeText(requireContext(), "Clicked on ${it.productName}", Toast.LENGTH_SHORT)
                .show()
        }, {
            Toast.makeText(requireContext(), "Image button clicked!", Toast.LENGTH_SHORT).show()
        })


    }


    fun addProductList(): ArrayList<productDao> {
        var productList = ArrayList<productDao>()

        productList.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )
        productList.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )
        productList.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )
        productList.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )
        productList.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )
        productList.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )

        return productList


    }


}