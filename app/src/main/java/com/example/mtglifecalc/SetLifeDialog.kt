package com.example.mtglifecalc

import android.app.Activity
import android.app.Dialog
import androidx.appcompat.widget.AppCompatButton

class SetLifeDialog {

    fun showSetLifeDialog(activity: Activity, screen: TwoPlayerScreen) {
        val lifeDialog = Dialog(activity)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            screen.changeHp(20)
            lifeDialog.dismiss()
        }
        btnHp30.setOnClickListener {
            screen.changeHp(30)
            lifeDialog.dismiss()
        }
        btnHp40.setOnClickListener {
            screen.changeHp(40)
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }
    fun showSetLifeDialog(activity: Activity, screen: ThreePlayerScreen) {
        val lifeDialog = Dialog(activity)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            screen.changeHp(20)
            lifeDialog.dismiss()
        }
        btnHp30.setOnClickListener {
            screen.changeHp(30)
            lifeDialog.dismiss()
        }
        btnHp40.setOnClickListener {
            screen.changeHp(40)
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }
    fun showSetLifeDialog(activity: Activity, screen: FourPlayerScreen) {
        val lifeDialog = Dialog(activity)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            screen.changeHp(20)
            lifeDialog.dismiss()
        }
        btnHp30.setOnClickListener {
            screen.changeHp(30)
            lifeDialog.dismiss()
        }
        btnHp40.setOnClickListener {
            screen.changeHp(40)
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }
}