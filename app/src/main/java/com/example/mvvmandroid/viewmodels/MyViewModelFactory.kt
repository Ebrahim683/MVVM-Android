package com.example.mvvmandroid.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyViewModelFactory(private val counter:Int):ViewModelProvider.Factory {
	override fun <T : ViewModel> create(modelClass: Class<T>): T {
		return MyViewModel(counter) as T
	}
}