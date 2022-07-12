package com.example.mtglifecalc

import android.app.Dialog
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.DialogFragment
import com.example.mtglifecalc.databinding.ActivitySetStartingHpBinding
import java.lang.ClassCastException

object SetLifeDialog{

    fun showSetLifeDialog(context : Context, hp: IUpdatedHp) {
        val lifeDialog = Dialog(context)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            hp.getHp(20)
            lifeDialog.dismiss()
        }

        btnHp30.setOnClickListener {
            hp.getHp(30)
            lifeDialog.dismiss()
        }

        btnHp40.setOnClickListener {
            hp.getHp(40)
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }
}