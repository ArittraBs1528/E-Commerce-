package com.example.ecommer.screen.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.ecommer.R
import com.example.ecommer.databinding.FragmentCategoryfregmentBinding
import com.example.ecommer.databinding.FragmentHomefregmentBinding
import com.example.ecommer.screen.adapter.categoryAdapter
import com.example.ecommer.screen.models.categoryDao


class categoryfregment : Fragment(R.layout.fragment_categoryfregment) {

    private lateinit var binding: FragmentCategoryfregmentBinding
    private lateinit var adapter: categoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categoryfregment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentCategoryfregmentBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        var catergoryList = ArrayList<categoryDao>()


        //start
        catergoryList.add(
            categoryDao(
                R.drawable.shoe2, "Shoe2"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat2, "Watch"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat2, "Watch"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat2, "Watch"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat2, "Watch"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat2, "Watch"
            )
        )
        catergoryList.add(

            categoryDao(
                R.drawable.cat2, "Watch"
            )
        )
        //end


        binding.catRcv1.layoutManager =
            StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        binding.catRcv1.adapter = categoryAdapter(catergoryList,{

        })
    }

}