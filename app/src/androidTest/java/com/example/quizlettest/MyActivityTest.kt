package com.example.quizlettest

import android.content.Intent
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testIntentHandling() {
        // Create an intent with the desired data
        val intent = Intent(ApplicationProvider.getApplicationContext(), MainActivity::class.java).apply {
            putExtra("EXTRA_MESSAGE", "Test Message")
        }

        // Launch the activity with the intent
        ActivityScenario.launch<MainActivity>(intent).use { scenario ->
            // Perform assertions to verify the behavior of onCreate() with the given intent
            composeTestRule.onNodeWithText("Hello, Test Message!").assertIsDisplayed()
        }
    }
}
