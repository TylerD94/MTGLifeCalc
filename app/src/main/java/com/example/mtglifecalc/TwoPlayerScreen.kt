package com.example.mtglifecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TwoPlayerScreen : AppCompatActivity() {

    var p1_hp_tv : TextView? = null
    var p1_hp_up : Button? = null
    var p1_hp_down : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_player_screen)

        var p1_hp = 40

        p1_hp_tv = findViewById(R.id.tv_p1_hp)
        p1_hp_up = findViewById(R.id.btn_p1_hp_up)
        p1_hp_down = findViewById(R.id.btn_p1_hp_down)

        p1_hp_tv?.text = p1_hp.toString()

        p1_hp_up?.setOnClickListener {
            p1_hp++
            p1_hp_tv?.text = p1_hp.toString()
        }

        p1_hp_down?.setOnClickListener {
            p1_hp--
            p1_hp_tv?.text = p1_hp.toString()
        }
    }
}