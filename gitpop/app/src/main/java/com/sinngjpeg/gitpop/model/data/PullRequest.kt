package com.sinngjpeg.gitpop.model.data

import com.google.gson.annotations.SerializedName

data class PullRequest(
    @SerializedName("html_url") val html_url: String,
    @SerializedName("title") val title: String,
    @SerializedName("created_at") val created: String,
    @SerializedName("body") val description: String,
    @SerializedName("user") val owner: Owner
)
