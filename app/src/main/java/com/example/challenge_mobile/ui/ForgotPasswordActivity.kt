package com.example.challenge_mobile.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.challenge_mobile.databinding.ActivityForgotPasswordBinding
import com.example.challenge_mobile.viewmodel.AuthViewModel

class ForgotPasswordActivity : AppCompatActivity() {

    // Usando ViewBinding para facilitar o acesso às views
    private lateinit var binding: ActivityForgotPasswordBinding

    // ViewModel é instanciado usando o delegate viewModels
    private val authViewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflando o layout usando ViewBinding
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
        setupObservers()
    }

    // Configura a UI e o listener do botão
    private fun setupUI() {
        // Configura o botão de redefinição de senha
        binding.resetButton.setOnClickListener {
            val email = binding.emailEditText.text.toString().trim()

            if (email.isNotEmpty()) {
                authViewModel.forgotPassword(email)
            } else {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Configura os observers para observar o ViewModel
    private fun setupObservers() {
        // Observa as mensagens de erro do ViewModel
        authViewModel.error.observe(this) { message ->
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        // Observa o estado de sucesso da recuperação de senha
        authViewModel.passwordResetSuccess.observe(this) { success ->
            if (success) {
                Toast.makeText(this, "Password reset email sent", Toast.LENGTH_SHORT).show()
                finish()  // Fecha a atividade após o envio do email de redefinição
            }
        }
    }
}
