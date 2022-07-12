package com.example.mtglifecalc

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.mtglifecalc.databinding.ActivityTwoPlayerScreenBinding

// TODO: Refactor all screens into fragments, inheriting off of a master screen class
class TwoPlayerScreen : AppCompatActivity(), IUpdatedHp {

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
            SetLifeDialog.showSetLifeDialog(this, this)
        }
    }

    private fun displayHp() {
        binding?.tvP1Hp?.text = viewModel!!.p1Hp.toString()
        binding?.tvP2Hp?.text = viewModel!!.p2Hp.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun getHp(hp: Int) {
        viewModel!!.startGame(hp)
        displayHp()
    }
}