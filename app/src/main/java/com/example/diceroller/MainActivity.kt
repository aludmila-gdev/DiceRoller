package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollDice()

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }

    }

    private fun rollDice() {
        val diceImageView : ImageView = findViewById(R.id.diceImageView)
        val roll = Dice(6).roll()

        diceImageView.contentDescription = roll.toString()

        when(roll){
            1 ->  diceImageView.setImageResource(R.drawable.dice_1)
            2 ->  diceImageView.setImageResource(R.drawable.dice_2)
            3 ->  diceImageView.setImageResource(R.drawable.dice_3)
            4 ->  diceImageView.setImageResource(R.drawable.dice_4)
            5 ->  diceImageView.setImageResource(R.drawable.dice_5)
            6 ->  diceImageView.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}