package com.example.mvvmandroid.viewmodels.quotes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmandroid.R

class QuotesActivity : AppCompatActivity() {
	private lateinit var textView: TextView
	private lateinit var btnNext: Button
	private lateinit var btnPrevious: Button
	private lateinit var quotesViewModel: QuotesViewModel
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_quotes)
		
		initView()
		
		quotesViewModel =
			ViewModelProvider(
				this,
				QuotesViewModelFactory(applicationContext)
			)[QuotesViewModel::class.java]
		setText(quotesModel = quotesViewModel.getQuote())
		
		
		btnNext.setOnClickListener {
			setText(quotesModel = quotesViewModel.nextQuote())
		}
		
		btnPrevious.setOnClickListener {
			setText(quotesModel = quotesViewModel.previousQuote())
		}
		
	}
	
	private fun initView() {
		textView = findViewById(R.id.id_tv)
		btnNext = findViewById(R.id.btn_next)
		btnPrevious = findViewById(R.id.btn_prev)
	}
	
	private fun setText(quotesModel: QuotesModel) {
		textView.text = quotesModel.content
	}
}