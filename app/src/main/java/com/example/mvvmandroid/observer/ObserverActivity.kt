package com.example.mvvmandroid.observer

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmandroid.R

private const val TAG = "ObserverActivity"

class ObserverActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_observer)
		
		lifecycle.addObserver(Observer(this))
		Toast.makeText(this, "Activity onCreate", Toast.LENGTH_SHORT).show()
	}
	
	override fun onStart() {
		super.onStart()
		Toast.makeText(this, "Activity onStart", Toast.LENGTH_SHORT).show()
	}
	
	override fun onResume() {
		super.onResume()
		Toast.makeText(this, "Activity onResume", Toast.LENGTH_SHORT).show()
	}
	
	override fun onPause() {
		super.onPause()
		Toast.makeText(this, "Activity onPause", Toast.LENGTH_SHORT).show()
	}
	
	override fun onStop() {
		super.onStop()
		Toast.makeText(this, "Activity onStop", Toast.LENGTH_SHORT).show()
	}
	
	override fun onDestroy() {
		super.onDestroy()
		Toast.makeText(this, "Activity onDestroy", Toast.LENGTH_SHORT).show()
	}
	
	
}