package com.ranzn.cleanarchit.app.persentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ranzn.cleanarchit.app.data.model.ResponseModel
import com.ranzn.cleanarchit.app.domain.use_cases.UseCases
import com.ranzn.cleanarchit.common.NetworkResult
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.collect

class MainViewModel(private val useCases: UseCases) : ViewModel() {

    private val _data = MutableLiveData<NetworkResult<ResponseModel>>()
    val data = _data as LiveData<NetworkResult<ResponseModel>>

    private val _data2 = MutableLiveData<ResponseModel>()
    val data2 = _data2 as LiveData<ResponseModel>


    init {
        val firstNetworkCall = viewModelScope.async {
            /**
             * Can also send NetworkResult with Success or Error to the activity or fragment and accordingly perform task...
             */
            useCases.getData().collect {
                _data.postValue(it)
            }
        }

        /**
         * Or can also send only data to activity or fragment and Handle the NetworkResult here by using some BaseActivity or BaseViewModel
         * So that we can have loading screen all over the application or having a error toast message there...
         */

        viewModelScope.async {
            firstNetworkCall.await()
            useCases.getAnotherData(1).collect { response ->
                when (response) {
                    is NetworkResult.Success -> _data2.postValue(response.data)
                    is NetworkResult.Error -> {}
                    is NetworkResult.Loading -> {}
                }
            }
        }
    }
}