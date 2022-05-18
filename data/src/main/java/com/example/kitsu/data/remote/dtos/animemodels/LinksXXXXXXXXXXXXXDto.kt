package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXXXXX(
    related,
    self
)