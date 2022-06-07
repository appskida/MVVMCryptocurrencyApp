package com.pm.mvvmcryptocurrencyapp.domain.model

import com.pm.mvvmcryptocurrencyapp.data.remote.dto.CoinDto

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)

fun CoinDto.toCoin(): Coin{
    return Coin(
        id= id,
        isActive = isActive,
        name = name,
        rank= rank,
        symbol = symbol
    )
}