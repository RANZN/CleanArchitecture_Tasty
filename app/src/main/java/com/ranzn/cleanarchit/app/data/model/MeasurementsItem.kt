package com.ranzn.cleanarchit.app.data.model

import com.google.gson.annotations.SerializedName

data class MeasurementsItem(

	@field:SerializedName("unit")
	val unit: Unit? = null,

	@field:SerializedName("quantity")
	val quantity: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)