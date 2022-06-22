package com.task.vajro.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.task.vajro.model.getProductList.ProductList
import retrofit2.Response

class MainViewModel : ViewModel() {

    val mockResponseLiveData: MutableLiveData<Response<List<ProductList>>> =  MutableLiveData()

    suspend fun mockLiveData() {

    }
}