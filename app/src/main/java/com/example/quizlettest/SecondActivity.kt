package com.example.quizlettest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizlettest.ui.theme.QuizletTestTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizletTestTheme {
                StartMainActivityButton()
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

    @Preview(showBackground = true)
    @Composable
    fun StartMainActivityButtonPreview() {
        QuizletTestTheme {
            StartMainActivityButton()
        }
    }
}
