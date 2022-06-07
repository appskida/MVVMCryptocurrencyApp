package com.pm.mvvmcryptocurrencyapp.data.respository

import com.pm.mvvmcryptocurrencyapp.data.remote.CoinPaprikaApi
import com.pm.mvvmcryptocurrencyapp.data.remote.dto.coin_detail.CoinDetailDto
import com.pm.mvvmcryptocurrencyapp.data.remote.dto.coin_list.CoinDto
import com.pm.mvvmcryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}