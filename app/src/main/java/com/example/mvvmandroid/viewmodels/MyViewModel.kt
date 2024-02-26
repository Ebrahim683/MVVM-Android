package com.example.mvvmandroid.viewmodels

import androidx.lifecycle.ViewModel

class MyViewModel(private var initialValue: Int) : ViewModel() {
	var counter = initialValue
	
	fun increment() {
		counter++
	}
}