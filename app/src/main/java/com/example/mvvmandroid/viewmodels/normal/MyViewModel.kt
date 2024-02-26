package com.example.mvvmandroid.viewmodels.normal

import androidx.lifecycle.ViewModel

class MyViewModel(initialValue: Int) : ViewModel() {
	var counter = initialValue
	
	fun increment() {
		counter++
	}
}