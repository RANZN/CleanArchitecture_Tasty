package com.ranzn.cleanarchit.app.data.model

import com.google.gson.annotations.SerializedName

data class TotalTimeTier(

	@field:SerializedName("tier")
	val tier: String? = null,

	@field:SerializedName("display_tier")
	val displayTier: String? = null
)