package com.example.quizlettest

import android.content.Intent
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testNoMessageReceived() {
        // Create an intent without the EXTRA_MESSAGE data
        val intent = Intent(ApplicationProvider.getApplicationContext(), MainActivity::class.java)

        // Launch the activity with the intent using ActivityScenario
        ActivityScenario.launch<MainActivity>(intent).use { scenario ->
            // Perform assertions to verify the default message is displayed
            composeTestRule.onNodeWithText("Hello, No message received!").assertIsDisplayed()
        }
    }
}
