@file:Suppress("DEPRECATION")

package com.example.mvvmandroid.observer

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

private const val TAG = "Observer"

class Observer(private var context: Context) : LifecycleObserver {
	
	@OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
	fun onCreate() {
		Toast.makeText(context, "Observer onCreate", Toast.LENGTH_SHORT).show()
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_START)
	fun onStart() {
		Toast.makeText(context, "Observer onStart", Toast.LENGTH_SHORT).show()
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
	fun onResume() {
		Toast.makeText(context, "Observer onResume", Toast.LENGTH_SHORT).show()
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
	fun onPause() {
		Toast.makeText(context, "Observer onPause", Toast.LENGTH_SHORT).show()
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_STOP)
	fun onStop() {
		Toast.makeText(context, "Observer onStop", Toast.LENGTH_SHORT).show()
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
	fun onDestroy() {
		Toast.makeText(context, "Observer onDestroy", Toast.LENGTH_SHORT).show()
	}
}