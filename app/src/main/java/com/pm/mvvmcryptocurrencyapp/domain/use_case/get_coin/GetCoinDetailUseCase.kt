package com.pm.mvvmcryptocurrencyapp.domain.use_case.get_coin

import com.pm.mvvmcryptocurrencyapp.common.Resource
import com.pm.mvvmcryptocurrencyapp.data.remote.dto.coin_detail.toCoinDetail
import com.pm.mvvmcryptocurrencyapp.domain.model.coin_detail.CoinDetail
import com.pm.mvvmcryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinDetailUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coinDetail = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coinDetail))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexptexcted error occured"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Couldn't reach server. Check your internet connectoin"))
        }
    }
}