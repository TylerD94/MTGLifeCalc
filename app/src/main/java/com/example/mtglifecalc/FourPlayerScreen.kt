package com.example.mtglifecalc

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.mtglifecalc.databinding.ActivityFourPlayerScreenBinding

class FourPlayerScreen : AppCompatActivity(), IUpdatedHp {

    private lateinit var binding: ActivityFourPlayerScreenBinding
    private lateinit var viewModel: PlayerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourPlayerScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        viewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)
        viewModel.startGame(intent.getIntExtra("Starting_Life", 40))
        displayHp()

        // TODO: Change these from onClickListener to a way that responds to held inputs.
        binding.btnP1HpUp.setOnClickListener {
            viewModel.increaseP1Hp()
            binding.tvP1Hp.text = viewModel.p1Hp.toString()
        }

        binding.btnP1HpDown.setOnClickListener {
            viewModel.decreaseP1Hp()
            binding.tvP1Hp.text = viewModel.p1Hp.toString()
        }

        binding.btnP2HpUp.setOnClickListener {
            viewModel.increaseP2Hp()
            binding.tvP2Hp.text = viewModel.p2Hp.toString()
        }

        binding.btnP2HpDown.setOnClickListener {
            viewModel.decreaseP2Hp()
            binding.tvP2Hp.text = viewModel.p2Hp.toString()
        }

        binding.btnP3HpUp.setOnClickListener {
            viewModel.increaseP3Hp()
            binding.tvP3Hp.text = viewModel.p3Hp.toString()
        }

        binding.btnP3HpDown.setOnClickListener {
            viewModel.decreaseP3Hp()
            binding.tvP3Hp.text = viewModel.p3Hp.toString()
        }

        binding.btnP4HpUp.setOnClickListener {
            viewModel.increaseP4Hp()
            binding.tvP4Hp.text = viewModel.p4Hp.toString()
        }

        binding.btnP4HpDown.setOnClickListener {
            viewModel.decreaseP4Hp()
            binding.tvP4Hp.text = viewModel.p4Hp.toString()
        }

        binding.btnResetGame.setOnClickListener {
            viewModel.startGame(viewModel.startingHp)
            displayHp()
        }

        binding.btnSetStartingLife.setOnClickListener {
            SetLifeDialog.showSetLifeDialog(this, this)
        }
    }

    private fun displayHp() {
        binding.tvP1Hp.text = viewModel.p1Hp.toString()
        binding.tvP2Hp.text = viewModel.p2Hp.toString()
        binding.tvP3Hp.text = viewModel.p3Hp.toString()
        binding.tvP4Hp.text = viewModel.p4Hp.toString()
    }

    override fun getHp(hp: Int) {
        viewModel.startGame(hp)
        displayHp()
    }
}