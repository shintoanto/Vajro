package com.task.vajro.model.getProductList

import com.google.gson.annotations.SerializedName

data class ProductList(
    @SerializedName("products")
    val Products: List<Product>
)