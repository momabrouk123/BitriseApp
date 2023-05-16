package com.example.bitriseapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
     fun useAppContext() {
         val appContext = InstrumentationRegistry.getInstrumentation().targetContext
         Assert.assertEquals("com.example.bitriseapp", appContext.packageName)
         }

    @Test
    fun useAppContext2() {
        Assert.assertEquals("testing", "testing")
    }

}