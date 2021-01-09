package com.sinngjpeg.gitpop.model.data

import com.google.gson.annotations.SerializedName


data class ItemRepository(
    @SerializedName("items") val items: List<Repository>
)
