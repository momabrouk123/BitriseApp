package com.example.bitriseapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun first_test(){
        rule.setContent {
            GreetingPreview()
        }

        rule.onNodeWithText("Pause").performClick()

        rule.onNodeWithText("Pause").assertExists()
    }
}