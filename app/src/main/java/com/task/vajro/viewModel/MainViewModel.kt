package com.task.vajro.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.task.vajro.model.getProductList.ProductList
import com.task.vajro.repository.MockRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: MockRepository) : ViewModel() {

    val mockResponseLiveData: MutableLiveData<Response<List<ProductList>>> = MutableLiveData()

    init {
        suspend {
            mockLiveData()
        }
    }
    suspend fun mockLiveData() {
        viewModelScope.launch {
            val responseRepo = repository.mockApiRepository()
            mockResponseLiveData.value = responseRepo
        }
    }
}