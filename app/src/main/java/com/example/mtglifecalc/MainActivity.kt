package com.example.mtglifecalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var startingHp : Int = 40 // Default if no button was selected
    var startingHp20Btn : Button? = null
    var startingHp30Btn : Button? = null
    var startingHp40Btn : Button? = null

    var twoPlayerBtn : Button? = null
    var threePlayerBtn : Button? = null
    var fourPlayerBtn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startingHp20Btn = findViewById(R.id.btn_set_20_hp)
        startingHp30Btn = findViewById(R.id.btn_set_30_hp)
        startingHp40Btn = findViewById(R.id.btn_set_40_hp)

        twoPlayerBtn = findViewById(R.id.btn_set_2_players)
        threePlayerBtn = findViewById(R.id.btn_set_3_players)
        fourPlayerBtn = findViewById(R.id.btn_set_4_players)

        startingHp20Btn?.setOnClickListener { startingHp = 20 }
        startingHp30Btn?.setOnClickListener { startingHp = 30 }
        startingHp40Btn?.setOnClickListener { startingHp = 40 }

        twoPlayerBtn?.setOnClickListener {
            val startTwoPlayerGame = Intent(this, TwoPlayerScreen::class.java)
            startTwoPlayerGame.putExtra("Starting_Life", startingHp)
            startActivity(startTwoPlayerGame)
            finish()
        }
        threePlayerBtn?.setOnClickListener {
            Toast.makeText(this, "TODO: Make three player activity", Toast.LENGTH_SHORT).show()
        }
        fourPlayerBtn?.setOnClickListener {
            Toast.makeText(this, "TODO: Make four player activity", Toast.LENGTH_SHORT).show()
        }

    }
}