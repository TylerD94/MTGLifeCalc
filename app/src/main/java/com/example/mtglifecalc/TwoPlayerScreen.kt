package com.example.mtglifecalc

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.mtglifecalc.databinding.ActivityTwoPlayerScreenBinding

class TwoPlayerScreen : AppCompatActivity() {

    private var binding: ActivityTwoPlayerScreenBinding? = null
    private var viewModel: PlayerViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoPlayerScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        init()
    }

    private fun init() {
        viewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)
        viewModel?.startGame(intent.getIntExtra("Starting_Life", 40))
        displayHp()

        // TODO: Change these from onClickListener to a way that responds to held inputs.
        binding?.btnP1HpUp?.setOnClickListener {
            viewModel?.increaseP1Hp()
            binding?.tvP1Hp?.text = viewModel?.p1Hp.toString()
        }

        binding?.btnP1HpDown?.setOnClickListener {
            viewModel?.decreaseP1Hp()
            binding?.tvP1Hp?.text = viewModel?.p1Hp.toString()
        }

        binding?.btnP2HpUp?.setOnClickListener {
            viewModel?.increaseP2Hp()
            binding?.tvP2Hp?.text = viewModel?.p2Hp.toString()
        }

        binding?.btnP2HpDown?.setOnClickListener {
            viewModel?.decreaseP2Hp()
            binding?.tvP2Hp?.text = viewModel?.p2Hp.toString()
        }

        binding?.btnResetGame?.setOnClickListener {
            viewModel?.startGame(viewModel!!.startingHp)
            displayHp()
        }

        binding?.btnSetStartingLife?.setOnClickListener {
            var dialog = SetLifeDialog(1)
            dialog.showSetLifeDialog(this)
        }
    }

    private fun displayHp() {
        binding?.tvP1Hp?.text = viewModel!!.p1Hp.toString()
        binding?.tvP2Hp?.text = viewModel!!.p2Hp.toString()
    }

    private fun showSetLifeDialog() {
        val lifeDialog = Dialog(this)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            viewModel!!.startGame(20)
            displayHp()
            lifeDialog.dismiss()
        }

        btnHp30.setOnClickListener {
            viewModel!!.startGame(30)
            displayHp()
            lifeDialog.dismiss()
        }

        btnHp40.setOnClickListener {
            viewModel!!.startGame(40)
            displayHp()
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}