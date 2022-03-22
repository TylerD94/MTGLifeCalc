package com.example.mtglifecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TwoPlayerScreen : AppCompatActivity() {

    var p1HpTv : TextView? = null
    var p1HpUp : Button? = null
    var p1HpDown : Button? = null

    var p2HpTv: TextView? = null
    var p2HpUp : Button? = null
    var p2HpDown: Button? = null

    var p1Hp = 0
    var p2Hp = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_player_screen)

        p1Hp = intent.getIntExtra("Starting_Life", 40)
        p2Hp = intent.getIntExtra("Starting_Life", 40)

        p1HpTv = findViewById(R.id.tv_p1_hp)
        p2HpTv = findViewById(R.id.tv_p2_hp)

        p1HpUp = findViewById(R.id.btn_p1_hp_up)
        p1HpDown = findViewById(R.id.btn_p1_hp_down)
        p2HpUp = findViewById(R.id.btn_p2_hp_up)
        p2HpDown = findViewById(R.id.btn_p2_hp_down)

        p1HpTv?.text = p1Hp.toString()
        p2HpTv?.text = p2Hp.toString()


        p1HpUp?.setOnClickListener {
            p1Hp++
            p1HpTv?.text = p1Hp.toString()
        }

        p1HpDown?.setOnClickListener {
            p1Hp--
            p1HpTv?.text = p1Hp.toString()
        }

        p2HpUp?.setOnClickListener {
            p2Hp++
            p2HpTv?.text = p2Hp.toString()
        }

        p2HpDown?.setOnClickListener {
            p2Hp--
            p2HpTv?.text = p2Hp.toString()
        }
    }
}