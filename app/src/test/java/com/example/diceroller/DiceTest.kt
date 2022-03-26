package com.example.diceroller

import junit.framework.Assert.assertTrue
import org.junit.Test

class DiceTest {

    @Test
    fun rollNumberShouldSeeBetweenOneAndSix() {
        val dice = Dice(6)
        val rollNumber = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollNumber in 1..6)
    }
}