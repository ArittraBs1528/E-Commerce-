package com.example.ecommer.screen.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommer.R
import com.example.ecommer.databinding.FragmentHomefregmentBinding
import com.example.ecommer.screen.adapter.categoryAdapter
import com.example.ecommer.screen.models.categoryDao
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class homefragment : Fragment(R.layout.fragment_homefregment) {

    private lateinit var binding: FragmentHomefregmentBinding
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
                imageDrawable = R.drawable.carousel_img1
            )


        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.furniture
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
        binding.rcv1.adapter = categoryAdapter(catergoryList)

    }

}