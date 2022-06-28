package ru.turbopro.currencyconverter.data.models

data class CurrencyResponse(
    val date: String,
    val info: Info,
    val query: Query,
    val result: Double,
    val success: Boolean
)