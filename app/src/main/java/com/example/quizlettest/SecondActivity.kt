package com.example.quizlettest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizlettest.ui.theme.QuizletTestTheme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizletTestTheme {
                StartMainActivityButton()
                Greeting()
            }
        }
    }

    @Composable
    fun StartMainActivityButton() {
        Button(
            onClick = {
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("EXTRA_MESSAGE", "Hello from SecondActivity!")
                }
                startActivity(intent)
            }
        ) {
            Text(text = "Start MainActivity")
        }
    }

    @Composable
    fun Greeting() {
        Scaffold(
            topBar = {
                // Top bar content
            },
            content = { innerPadding ->
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Your existing content
                    Text(text = "Hello, World!")
                    // Add your new UI components here
                    Button(onClick = { /* Handle button click */ }) {
                        Text("Click Me")
                    }
                }
            }
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun StartMainActivityButtonPreview() {
        QuizletTestTheme {
            StartMainActivityButton()
        }
    }
}
