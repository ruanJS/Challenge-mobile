package com.example.challenge_mobile.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challenge_mobile.models.User
import com.example.challenge_mobile.repository.AuthRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthViewModel : ViewModel() {

    private val repository = AuthRepository()

    // LiveData para o usuário logado
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    // LiveData para mensagens de erro
    private val _error = MutableLiveData<String>()
    val error: LiveData<String> get() = _error

    // LiveData para sucesso de reset de senha
    private val _passwordResetSuccess = MutableLiveData<Boolean>()
    val passwordResetSuccess: LiveData<Boolean> get() = _passwordResetSuccess

    // Função de login
    fun login(email: String, password: String) {
        val user = User(email, password)
        repository.login(user).enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.isSuccessful) {
                    _user.postValue(response.body())
                } else {
                    _error.postValue("Login failed")
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                _error.postValue(t.message)
            }
        })
    }

    // Função para reset de senha
    fun forgotPassword(email: String) {
        repository.forgotPassword(email).enqueue(object : Callback<Void> {
            override fun onResponse(call: Call<Void>, response: Response<Void>) {
                if (response.isSuccessful) {
                    _passwordResetSuccess.postValue(true) // Sucesso no reset de senha
                    _error.postValue("Password reset email sent")
                } else {
                    _passwordResetSuccess.postValue(false) // Falha no reset
                    _error.postValue("Error sending reset email")
                }
            }

            override fun onFailure(call: Call<Void>, t: Throwable) {
                _passwordResetSuccess.postValue(false) // Falha no reset
                _error.postValue(t.message)
            }
        })
    }
}

private fun <T> Call<T>.enqueue(callback: Callback<Void>) = Unit
