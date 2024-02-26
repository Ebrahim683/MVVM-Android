package com.example.mvvmandroid.viewmodels

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmandroid.R

class ViewModelActivity : AppCompatActivity() {
	private lateinit var textView: TextView
	private lateinit var myViewModel: MyViewModel
	
	@SuppressLint("MissingInflatedId")
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_view_model)
		
		textView = findViewById(R.id.id_tv)
		
		myViewModel = ViewModelProvider(this, MyViewModelFactory(0))[MyViewModel::class.java]
		setText()
		findViewById<Button>(R.id.id_btn).setOnClickListener {
			myViewModel.increment()
			setText()
		}
	}
	
	private fun setText() {
		textView.text = myViewModel.counter.toString()
	}
	
}