package com.pm.mvvmcryptocurrencyapp.domain.repository

import com.pm.mvvmcryptocurrencyapp.data.remote.dto.coin_detail.CoinDetailDto
import com.pm.mvvmcryptocurrencyapp.data.remote.dto.coin_list.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}