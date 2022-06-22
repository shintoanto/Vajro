package com.task.vajro.repository

import com.task.vajro.model.getProductList.ProductList
import com.task.vajro.network.mockRetrofitApi
import retrofit2.Response

class MockRepository {

    suspend fun mockApiRepository(): Response<List<ProductList>> =
        mockRetrofitApi.retrofitMockApi.mockProductList()
}