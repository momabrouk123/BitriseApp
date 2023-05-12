package com.example.bitriseapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

//    @get:Rule
//    val rule = createComposeRule()
//    @Test
//    fun first_test(){
//        rule.setContent {
//            Greeting()
//        }
//
//        rule.onNodeWithText("1").performClick()
//
//        rule.onNodeWithText("1").assertExists()
//    }


    @Test
     fun useAppContext() {
        // Context of the app under test.
         val appContext = InstrumentationRegistry.getInstrumentation().targetContext
         Assert.assertEquals("com.example.bitriseapp", appContext.packageName)
         }

}