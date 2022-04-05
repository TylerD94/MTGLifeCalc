package com.example.mtglifecalc

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.mtglifecalc.databinding.ActivityTwoPlayerScreenBinding

class TwoPlayerScreen : AppCompatActivity() {

    private var binding: ActivityTwoPlayerScreenBinding? = null

    private var startingHp = 40
    private var p1Hp = 0
    private var p2Hp = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoPlayerScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        init()
    }

    private fun init() {
        // Set starting life totals and display on start
        startingHp = intent.getIntExtra("Starting_Life", 40)
        setStartingHp()

        // TODO: Change these from onClickListener to a way that responds to held inputs.
        binding?.btnP1HpUp?.setOnClickListener {
            p1Hp++
            binding?.tvP1Hp?.text = p1Hp.toString()
        }

        binding?.btnP1HpDown?.setOnClickListener {
            p1Hp--
            binding?.tvP1Hp?.text = p1Hp.toString()
        }

        binding?.btnP2HpUp?.setOnClickListener {
            p2Hp++
            binding?.tvP2Hp?.text = p2Hp.toString()
        }

        binding?.btnP2HpDown?.setOnClickListener {
            p2Hp--
            binding?.tvP2Hp?.text = p2Hp.toString()
        }

        binding?.btnResetGame?.setOnClickListener {
            resetGame()
        }

        binding?.btnSetStartingLife?.setOnClickListener {
            showSetLifeDialog()
        }
    }

    private fun resetGame() {
        setStartingHp()
    }

    private fun setStartingHp() {
        p1Hp = startingHp
        p2Hp = startingHp

        binding?.tvP1Hp?.text = p1Hp.toString()
        binding?.tvP2Hp?.text = p2Hp.toString()
    }

    private fun showSetLifeDialog() {
        val lifeDialog = Dialog(this)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            startingHp = 20
            resetGame()
            lifeDialog.dismiss()
        }
        btnHp30.setOnClickListener {
            startingHp = 30
            resetGame()
            lifeDialog.dismiss()
        }
        btnHp40.setOnClickListener {
            startingHp = 40
            resetGame()
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}