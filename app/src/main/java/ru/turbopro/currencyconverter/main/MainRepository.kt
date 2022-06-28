package ru.turbopro.currencyconverter.main

import ru.turbopro.currencyconverter.data.models.CurrencyResponse
import ru.turbopro.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(to: String, from: String, amount: String, apikey: String): Resource<CurrencyResponse>
}