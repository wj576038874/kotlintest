package com.example.kotlintest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.concurrent.thread

/**
 * author: wenjie
 * date: 2021-08-13 10:51
 * descption:
 */
class MyVIewModel : ViewModel() {

    val intData by lazyInit { MutableLiveData<String>() }

    fun asd(string: String){
        intData.value = string
    }
}