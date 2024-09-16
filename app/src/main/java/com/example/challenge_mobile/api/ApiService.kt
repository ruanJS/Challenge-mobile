package com.example.challenge_mobile.api

import com.example.challenge_mobile.models.User
import com.example.challenge_mobile.models.EmailRequest
import com.example.challenge_mobile.models.GenericResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    fun login(@Body user: User): Call<User>

    @POST("forgot-password")
    fun forgotPassword(@Body emailRequest: EmailRequest): Call<GenericResponse>
}
