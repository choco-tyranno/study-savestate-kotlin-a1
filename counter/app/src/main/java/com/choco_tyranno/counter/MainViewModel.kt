package com.choco_tyranno.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val state : SavedStateHandle) : ViewModel(){
    var count : Int = 0
    set(value) {
        field = value
        countLiveData.value = value
        state.set("count",value)
    }
    val countLiveData : MutableLiveData<Int> = MutableLiveData<Int>(count)

    fun increaseCount() = count++
    fun decreaseCount() = count--
}