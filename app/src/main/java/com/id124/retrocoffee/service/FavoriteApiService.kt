package com.id124.retrocoffee.service

import com.id124.retrocoffee.model.favorite.FavoriteResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface FavoriteApiService {

    @GET("favorite/{csId}")
    suspend fun getFavoriteProduct(@Path("csId") costumerID: String) : FavoriteResponse

}