package com.example.mvvmandroid.livedata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmandroid.R

class LiveDataActivity : AppCompatActivity() {
	private val textView: TextView
		get() = findViewById(R.id.id_tv)
	
	private val updateButton: Button
		get() = findViewById(R.id.btn_update)
	
	private lateinit var liveDataViewModel: LiveDataViewModel
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_live_data)
		
		liveDataViewModel = ViewModelProvider(this)[LiveDataViewModel::class.java]
		
		liveDataViewModel.getData.observe(this) {
			textView.text = it
		}
		
		updateButton.setOnClickListener {
			liveDataViewModel.updateData()
		}
		
	}
}