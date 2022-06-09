package com.pm.mvvmcryptocurrencyapp.presentation.coin_detail

import com.pm.mvvmcryptocurrencyapp.domain.model.coin_detail.CoinDetail
import com.pm.mvvmcryptocurrencyapp.domain.model.coin_list.Coin

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coinDetail: CoinDetail? = null,
    val error: String = ""
)
