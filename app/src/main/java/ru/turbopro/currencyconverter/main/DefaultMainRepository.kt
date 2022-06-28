package ru.turbopro.currencyconverter.main

import ru.turbopro.currencyconverter.data.CurrencyApi
import ru.turbopro.currencyconverter.data.models.CurrencyResponse
import ru.turbopro.currencyconverter.util.Resource
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository {

    override suspend fun getRates(to: String, from: String, amount: String, apikey: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(to, from, amount, apikey)
            val result = response.body()
            if(response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch(e: Exception) {
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}