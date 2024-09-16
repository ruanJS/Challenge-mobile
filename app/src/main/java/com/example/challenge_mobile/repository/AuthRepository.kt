package com.example.challenge_mobile.repository

import com.example.challenge_mobile.api.ApiClient
import com.example.challenge_mobile.api.ApiService
import com.example.challenge_mobile.models.EmailRequest
import com.example.challenge_mobile.models.GenericResponse
import com.example.challenge_mobile.models.User
import retrofit2.Call

class AuthRepository {
    private val apiService: ApiService = ApiClient.retrofit.create(ApiService::class.java)

    fun login(user: User): Call<User> {
        return apiService.login(user)
    }

    fun forgotPassword(email: String): Call<GenericResponse> {
        val emailRequest = EmailRequest(email)
        return apiService.forgotPassword(emailRequest)
    }
}
