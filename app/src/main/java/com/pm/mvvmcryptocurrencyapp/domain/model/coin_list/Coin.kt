package com.pm.mvvmcryptocurrencyapp.domain.model.coin_list

import com.pm.mvvmcryptocurrencyapp.data.remote.dto.coin_list.CoinDto

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)