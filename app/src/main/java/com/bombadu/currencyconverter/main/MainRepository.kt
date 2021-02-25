package com.bombadu.currencyconverter.main

import com.bombadu.currencyconverter.data.models.CurrencyResponse
import com.bombadu.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}