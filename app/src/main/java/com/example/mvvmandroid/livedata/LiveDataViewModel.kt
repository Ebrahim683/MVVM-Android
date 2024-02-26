package com.example.mvvmandroid.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {
	
	private var data = MutableLiveData<String>("Initial data")
	val getData: LiveData<String>
		get() = data
	
	fun updateData() {
		data.value = "New data"
	}
}