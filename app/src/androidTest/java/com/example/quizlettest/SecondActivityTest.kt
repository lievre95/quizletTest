package com.example.quizlettest

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.assertIsDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<SecondActivity>()

    @Test
    fun testGreetingComposable() {
        // Check if "Hello, World!" text is displayed
        composeTestRule.onNodeWithText("Hello, World!").assertIsDisplayed()

        // Check if "Click Me" button is displayed
        composeTestRule.onNodeWithText("Click Me").assertIsDisplayed()

        // Perform click action on the button
        composeTestRule.onNodeWithText("Click Me").performClick()

        // Here you can add more assertions to verify the result of the button click if necessary
    }
}
