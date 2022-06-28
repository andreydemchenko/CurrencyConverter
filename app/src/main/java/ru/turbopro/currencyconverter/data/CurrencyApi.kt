package ru.turbopro.currencyconverter.data

import ru.turbopro.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("exchangerates_data/convert")
    suspend fun getRates(
        @Query("to") to: String,
        @Query("from") from: String,
        @Query("amount") amount: String,
        @Query("apikey") apikey: String
    ): Response<CurrencyResponse>
}