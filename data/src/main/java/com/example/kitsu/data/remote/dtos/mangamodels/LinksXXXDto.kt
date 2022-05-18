package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.LinksXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXDto(
    @SerializedName("related")
    val related: String?,
    @SerializedName("self")
    val self: String?
)

fun LinksXXXDto.toDomain() = LinksXXX(
    related, self
)