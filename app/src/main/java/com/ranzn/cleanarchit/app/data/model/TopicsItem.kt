package com.ranzn.cleanarchit.app.data.model

import com.google.gson.annotations.SerializedName

data class TopicsItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)