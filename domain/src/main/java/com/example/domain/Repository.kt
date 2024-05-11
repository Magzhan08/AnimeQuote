package com.example.domain

interface Repository {

    suspend fun loadQuote(): Pair<Boolean, String>
}