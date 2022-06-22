package com.task.vajro.network

import com.task.vajro.model.getProductList.ProductList
import retrofit2.Response
import retrofit2.http.GET

interface MockApi {

    @GET("v2/5def7b172f000063008e0aa2")
    suspend fun mockProductList(): Response<List<ProductList>>
}