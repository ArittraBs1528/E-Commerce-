package com.example.ecommer.screen.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommer.R
import com.example.ecommer.databinding.FragmentHomefregmentBinding
import com.example.ecommer.screen.adapter.categoryAdapter
import com.example.ecommer.screen.adapter.productAdapter
import com.example.ecommer.screen.adapter.productDao
import com.example.ecommer.screen.models.categoryDao
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class homefragment : Fragment(R.layout.fragment_homefregment) {

    private lateinit var binding: FragmentHomefregmentBinding
    private lateinit var adapter: productAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentHomefregmentBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.carousel.registerLifecycle(viewLifecycleOwner)

        val list = mutableListOf<CarouselItem>()
        var catergoryList = ArrayList<categoryDao>()

        list.add(
            CarouselItem(
                imageDrawable = R.drawable.shoe2
            )


        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.furniture4
            )


        )

        list.add(
            CarouselItem(
                imageDrawable = R.drawable.fish
            )


        )
        binding.carousel.setData(list)


//        binding.rcv1.la

        catergoryList.add(

            categoryDao(
                R.drawable.cat1, "Food"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat2, "Watch"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat3, "Phones"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat4, "Furniture"
            )
        )

        binding.rcv1.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rcv1.adapter = categoryAdapter(catergoryList) {
//            val action = homefragmentDirections.actionHomefregmentToProductListFregement()
            val action = homefragmentDirections.actionHomefregmentToProductListFregement()
            findNavController().navigate(action)

        }


        //for best selling
        var bestSellingList = ArrayList<productDao>()
        bestSellingList.add(

            productDao(
                R.drawable.watch, "Men's Watch", "$2500"
            )
        )
        bestSellingList.add(

            productDao(
                R.drawable.orange, "Joss Orange 8ps", "$2500"
            )
        )
        bestSellingList.add(

            productDao(
                R.drawable.fish, "Joss Orange 8ps", "$2500"
            )
        )

        binding.rcv2.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rcv2.adapter = productAdapter(bestSellingList, {
            val action = homefragmentDirections.actionHomefregmentToProductDetails()
            findNavController().navigate(action)


        }, {


            Toast.makeText(requireContext(), "Image button clicked!", Toast.LENGTH_SHORT).show()

        })


        var featureProduction = ArrayList<productDao>()

        featureProduction.add(
            productDao(
                R.drawable.feature1, "Joss Orange 8ps", "$2500"
            )
        )
        featureProduction.add(
            productDao(
                R.drawable.feature2, "Joss Orange 8ps", "$2500"
            )
        )
        featureProduction.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )



        binding.rcv3.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rcv3.adapter = productAdapter(featureProduction, {

            val action = homefragmentDirections.actionHomefregmentToProductDetails()
            findNavController().navigate(action)
        }, {


            Toast.makeText(requireContext(), "Image button clicked!", Toast.LENGTH_SHORT).show()

        })

        var showProduction = ArrayList<productDao>()
        showProduction.add(
            productDao(
                R.drawable.shoe, "Joss Orange 8ps", "$2500"
            )
        )
        showProduction.add(
            productDao(
                R.drawable.feature2, "Joss Orange 8ps", "$2500"
            )
        )
        showProduction.add(
            productDao(
                R.drawable.shoe2, "Joss Orange 8ps", "$2500"
            )
        )

        binding.rcv4.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rcv4.adapter = productAdapter(featureProduction, {

            val action = homefragmentDirections.actionHomefregmentToProductDetails()
            findNavController().navigate(action)
        }, {


            Toast.makeText(requireContext(), "Image button clicked!", Toast.LENGTH_SHORT).show()

        })
    }


}