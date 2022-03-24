package com.example.mtglifecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mtglifecalc.databinding.ActivityFourPlayerScreenBinding

class FourPlayerScreen : AppCompatActivity() {

    private var binding: ActivityFourPlayerScreenBinding? = null

    var p1Hp = 0
    var p2Hp = 0
    var p3Hp = 0
    var p4Hp = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourPlayerScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        init()
    }

    private fun init() {
        // Set starting life totals and display on start
        p1Hp = intent.getIntExtra("Starting_Life", 40)
        p2Hp = intent.getIntExtra("Starting_Life", 40)
        p3Hp = intent.getIntExtra("Starting_Life", 40)
        p4Hp = intent.getIntExtra("Starting_Life", 40)

        binding?.tvP1Hp?.text = p1Hp.toString()
        binding?.tvP2Hp?.text = p2Hp.toString()
        binding?.tvP3Hp?.text = p3Hp.toString()
        binding?.tvP4Hp?.text = p4Hp.toString()

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

        binding?.btnP3HpUp?.setOnClickListener {
            p3Hp++
            binding?.tvP3Hp?.text = p3Hp.toString()
        }

        binding?.btnP3HpDown?.setOnClickListener {
            p3Hp--
            binding?.tvP3Hp?.text = p3Hp.toString()
        }

        binding?.btnP4HpUp?.setOnClickListener {
            p4Hp++
            binding?.tvP4Hp?.text = p4Hp.toString()
        }

        binding?.btnP4HpDown?.setOnClickListener {
            p4Hp--
            binding?.tvP4Hp?.text = p4Hp.toString()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}