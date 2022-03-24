package com.example.mtglifecalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mtglifecalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    var startingHp : Int = 40 // Default if no button was selected

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnSet20Hp?.setOnClickListener { startingHp = 20 }
        binding?.btnSet30Hp?.setOnClickListener { startingHp = 30 }
        binding?.btnSet40Hp?.setOnClickListener { startingHp = 40 }

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

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}