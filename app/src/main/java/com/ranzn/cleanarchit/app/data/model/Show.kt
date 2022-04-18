package com.ranzn.cleanarchit.app.data.model

import com.google.gson.annotations.SerializedName

data class Show(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)