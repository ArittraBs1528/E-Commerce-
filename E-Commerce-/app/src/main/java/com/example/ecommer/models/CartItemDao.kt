package com.example.ecommer.models

data class CartItemDao(
    var id: String,
    val productName : String,
    val productimage : Int,
    var productQuantity: String,
    val originalPrice: String,
    val discountPrice: String

)
