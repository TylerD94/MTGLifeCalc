package com.example.mtglifecalc

import android.app.Dialog
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.DialogFragment

class SetLifeDialog(contentLayoutId: Int) : DialogFragment(contentLayoutId) {
    fun showSetLifeDialog(compat : AppCompatActivity) {
        val lifeDialog = Dialog(compat)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            Toast.makeText(compat, "20 pressed!", Toast.LENGTH_SHORT).show()
            lifeDialog.dismiss()
        }

        btnHp30.setOnClickListener {
            lifeDialog.dismiss()
        }

        btnHp40.setOnClickListener {
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }
}