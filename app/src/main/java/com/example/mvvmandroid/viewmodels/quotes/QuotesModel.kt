package com.example.mvvmandroid.viewmodels.quotes

import com.google.gson.annotations.SerializedName

data class QuotesModel(
	@SerializedName("author")
	val author: String?,
	@SerializedName("text")
	val content: String?
)
