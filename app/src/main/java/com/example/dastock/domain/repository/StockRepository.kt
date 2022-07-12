package com.example.dastock.domain.repository

import com.example.dastock.domain.model.CompanyInfo
import com.example.dastock.domain.model.CompanyListing
import com.example.dastock.domain.model.IntradayInfo
import com.example.dastock.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}