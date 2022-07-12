package com.example.dastock.di

import com.example.dastock.data.csv.CSVParser
import com.example.dastock.data.csv.CompanyListingsParser
import com.example.dastock.data.csv.IntradayInfoParser
import com.example.dastock.data.repository.StockRepositoryImpl
import com.example.dastock.domain.model.CompanyListing
import com.example.dastock.domain.model.IntradayInfo
import com.example.dastock.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}