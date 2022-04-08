package com.rodriguez.justanotherapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResultViewModel : ViewModel() {

    var textResult = MutableLiveData("")

    fun identification(num: Int) {
        if (num % 2 == 0) {
            textResult.value = "Es par :D"
        } else {
            textResult.value = "Es impar :D"
        }
    }


}