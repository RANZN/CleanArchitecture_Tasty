package com.ranzn.cleanarchit.app.data.model

import com.google.gson.annotations.SerializedName

data class Item(

	@field:SerializedName("nutrition_visibility")
	val nutritionVisibility: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("instructions")
	val instructions: List<InstructionsItem?>? = null,

	@field:SerializedName("keywords")
	val keywords: String? = null,

	@field:SerializedName("facebook_posts")
	val facebookPosts: List<Any?>? = null,

	@field:SerializedName("language")
	val language: String? = null,

	@field:SerializedName("user_ratings")
	val userRatings: UserRatings? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("brand")
	val brand: Any? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("servings_noun_singular")
	val servingsNounSingular: String? = null,

	@field:SerializedName("show_id")
	val showId: Int? = null,

	@field:SerializedName("prep_time_minutes")
	val prepTimeMinutes: Any? = null,

	@field:SerializedName("sections")
	val sections: List<SectionsItem?>? = null,

	@field:SerializedName("brand_id")
	val brandId: Any? = null,

	@field:SerializedName("tags")
	val tags: List<TagsItem?>? = null,

	@field:SerializedName("nutrition")
	val nutrition: Nutrition? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("compilations")
	val compilations: List<Any?>? = null,

	@field:SerializedName("num_servings")
	val numServings: Int? = null,

	@field:SerializedName("buzz_id")
	val buzzId: Any? = null,

	@field:SerializedName("tips_and_ratings_enabled")
	val tipsAndRatingsEnabled: Boolean? = null,

	@field:SerializedName("aspect_ratio")
	val aspectRatio: String? = null,

	@field:SerializedName("show")
	val show: Show? = null,

	@field:SerializedName("created_at")
	val createdAt: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("draft_status")
	val draftStatus: String? = null,

	@field:SerializedName("inspired_by_url")
	val inspiredByUrl: Any? = null,

	@field:SerializedName("thumbnail_url")
	val thumbnailUrl: String? = null,

	@field:SerializedName("thumbnail_alt_text")
	val thumbnailAltText: String? = null,

	@field:SerializedName("total_time_minutes")
	val totalTimeMinutes: Any? = null,

	@field:SerializedName("video_url")
	val videoUrl: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: Int? = null,

	@field:SerializedName("credits")
	val credits: List<CreditsItem?>? = null,

	@field:SerializedName("approved_at")
	val approvedAt: Int? = null,

	@field:SerializedName("is_one_top")
	val isOneTop: Boolean? = null,

	@field:SerializedName("servings_noun_plural")
	val servingsNounPlural: String? = null,

	@field:SerializedName("renditions")
	val renditions: List<RenditionsItem?>? = null,

	@field:SerializedName("beauty_url")
	val beautyUrl: Any? = null,

	@field:SerializedName("is_shoppable")
	val isShoppable: Boolean? = null,

	@field:SerializedName("analytics_metadata")
	val analyticsMetadata: AnalyticsMetadata? = null,

	@field:SerializedName("topics")
	val topics: List<TopicsItem?>? = null,

	@field:SerializedName("total_time_tier")
	val totalTimeTier: Any? = null,

	@field:SerializedName("video_ad_content")
	val videoAdContent: String? = null,

	@field:SerializedName("seo_title")
	val seoTitle: String? = null,

	@field:SerializedName("yields")
	val yields: String? = null,

	@field:SerializedName("original_video_url")
	val originalVideoUrl: String? = null,

	@field:SerializedName("canonical_id")
	val canonicalId: String? = null,

	@field:SerializedName("cook_time_minutes")
	val cookTimeMinutes: Any? = null,

	@field:SerializedName("promotion")
	val promotion: String? = null,

	@field:SerializedName("video_id")
	val videoId: Int? = null
)