package com.example.mvvmandroid.viewmodels.quotes

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.gson.Gson

class QuotesViewModel(private val context: Context) : ViewModel() {
	
	private var quoteList: Array<QuotesModel> = emptyArray()
	private var index = 0
	
	init {
		quoteList = getQuoteListFromAssets()
	}
	
	fun getQuote() = quoteList[index]
	
	fun nextQuote() = quoteList[++index]
	
	fun previousQuote(): QuotesModel {
		return if (index > 0) {
			quoteList[index--]
		} else {
			quoteList[index]
		}
	}
	
	private fun getQuoteListFromAssets(): Array<QuotesModel> {
		val inputStream = context.assets.open("Quote.json")
		val size = inputStream.available()
		val buffer = ByteArray(size)
		inputStream.read(buffer)
		inputStream.close()
		val json = String(buffer, Charsets.UTF_8)
		val gson = Gson()
		val data = gson.fromJson(json, Array<QuotesModel>::class.java)
		Log.d(TAG, "getQuoteListFromAssets: $data")
		return data
	}
	
	companion object {
		private const val TAG = "QuotesViewModel"
	}
	
}