package com.task.vajro.model.getProductList

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("description")
    val Description: String,
    @SerializedName("href")
    val Href: String,
    @SerializedName("id")
    val Id: String,
    @SerializedName("image")
    val Image: String,
    @SerializedName("images")
    val Images: List<Any>,
    @SerializedName("name")
    val Name: String,
    @SerializedName("options")
    val Options: List<Any>,
    @SerializedName("price")
    val Price: String,
    @SerializedName("product_id")
    val Product_id: String,
    @SerializedName("quantity")
    val Quantity: Int,
    @SerializedName("sku")
    val Sku: String,
    @SerializedName("special")
    val Special: String,
    @SerializedName("thumb")
    val Thumb: String,
    @SerializedName("zoom_thumb")
    val Zoom_thumb: String
)