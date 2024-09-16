package com.example.challenge_mobile.models

data class User(
    val email: String,
    val password: String,
    val token: String? = null
)