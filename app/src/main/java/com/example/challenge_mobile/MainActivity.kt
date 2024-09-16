package com.example.challenge_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.challenge_mobile.theme.Challenge_MobileTheme
import com.example.challenge_mobile.viewmodel.AuthViewModel

class MainActivity : ComponentActivity() {

    // Instanciando o ViewModel para uso na UI
    private val authViewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challenge_MobileTheme {
                // Adicionando NavController para navegação entre telas
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Definindo o NavHost com uma tela inicial de saudação
                    NavHost(navController = navController, startDestination = "greeting") {
                        composable("greeting") { GreetingScreen("Android") }
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingScreen(name: String, viewModel: AuthViewModel = viewModel()) {
    // Você pode exibir informações do usuário ou outros dados do ViewModel aqui
    Greeting(name = name)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Challenge_MobileTheme {
        Greeting("Android")
    }
}
