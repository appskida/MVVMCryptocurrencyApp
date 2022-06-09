package com.pm.mvvmcryptocurrencyapp.presentation.coin_list

import com.pm.mvvmcryptocurrencyapp.domain.model.coin_list.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
