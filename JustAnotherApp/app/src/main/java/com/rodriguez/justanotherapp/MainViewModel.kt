package com.rodriguez.justanotherapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() { // Heredar ViewModel()

    var counter = MutableLiveData(0)

    fun add(num: Int) {
        counter.value = counter.value?.plus(num)
    }

    fun subtract(num: Int) {
        if (counter.value!! > 0) {
            counter.value = counter.value?.minus(num)
        }
    }
}