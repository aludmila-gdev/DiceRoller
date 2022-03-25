package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }

    }

    private fun rollDice() {
        val resultDice1: TextView = findViewById(R.id.textViewResultDice1)
        val resultDice2: TextView = findViewById(R.id.textViewResultDice2)
        val dice = Dice(6)
        resultDice1.text = dice.roll().toString()
        resultDice2.text = dice.roll().toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {

        return (1..numSides).random()
    }
}