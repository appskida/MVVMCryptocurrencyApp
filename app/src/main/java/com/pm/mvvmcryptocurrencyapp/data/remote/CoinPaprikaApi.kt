package com.pm.mvvmcryptocurrencyapp.data.remote

import com.pm.mvvmcryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

}