package ru.turbopro.currencyconverter.data.models

data class Query(
    val amount: Int,
    val from: String,
    val to: String
)