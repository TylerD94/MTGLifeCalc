package com.example.mtglifecalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.mtglifecalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    var startingHp : Int = 40 // Default if no button was selected

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnSet20Hp?.setOnClickListener {
            startingHp = 20
            setButtonSelected(binding?.btnSet20Hp as AppCompatButton)
        }
        binding?.btnSet30Hp?.setOnClickListener {
            startingHp = 30
            setButtonSelected(binding?.btnSet30Hp as AppCompatButton)
        }
        binding?.btnSet40Hp?.setOnClickListener {
            startingHp = 40
            setButtonSelected(binding?.btnSet40Hp as AppCompatButton)
        }

        binding?.btnSet2Players?.setOnClickListener {
            val startTwoPlayerGame = Intent(this, TwoPlayerScreen::class.java)
            startTwoPlayerGame.putExtra("Starting_Life", startingHp)
            startActivity(startTwoPlayerGame)
            finish()
        }
        binding?.btnSet3Players?.setOnClickListener {
            val startThreePlayerGame = Intent(this, ThreePlayerScreen::class.java)
            startThreePlayerGame.putExtra("Starting_Life", startingHp)
            startActivity(startThreePlayerGame)
            finish()
        }
        binding?.btnSet4Players?.setOnClickListener {
            val startFourPlayerGame = Intent(this, FourPlayerScreen::class.java)
            startFourPlayerGame.putExtra("Starting_Life", startingHp)
            startActivity(startFourPlayerGame)
            finish()
        }
    }

    private fun setButtonDefault() {
        binding?.btnSet20Hp?.setBackgroundResource(R.drawable.button)
        binding?.btnSet30Hp?.setBackgroundResource(R.drawable.button)
        binding?.btnSet40Hp?.setBackgroundResource(R.drawable.button)
    }

    private fun setButtonSelected(button: AppCompatButton) {
        setButtonDefault()
        button.setBackgroundResource(R.drawable.button_selected)
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}