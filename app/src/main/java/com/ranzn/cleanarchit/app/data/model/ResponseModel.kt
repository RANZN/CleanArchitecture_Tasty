package com.ranzn.cleanarchit.app.data.model

import com.google.gson.annotations.SerializedName

data class ResponseModel(

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null
)