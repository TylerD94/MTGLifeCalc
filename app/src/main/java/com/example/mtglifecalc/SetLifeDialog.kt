package com.example.mtglifecalc

import android.app.Dialog
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.DialogFragment
import java.lang.ClassCastException

class SetLifeDialog(contentLayoutId: Int) : DialogFragment(contentLayoutId) {
    private var setHp : IUpdatedHp? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            setHp = context as IUpdatedHp
        }
        catch (e : ClassCastException){
            Log.d("SetLifeDialog", "Activity doesn't implement IUpdatedHp interface.")
        }
    }

    fun showSetLifeDialog(context: Context) {
        val lifeDialog = Dialog(context)
        lifeDialog.setContentView(R.layout.activity_set_starting_hp)

        val btnHp20: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_20_hp)
        val btnHp30: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_30_hp)
        val btnHp40: AppCompatButton = lifeDialog.findViewById(R.id.btn_set_40_hp)

        btnHp20.setOnClickListener {
            setHp?.getHp(20)
            lifeDialog.dismiss()
        }

        btnHp30.setOnClickListener {
            setHp?.getHp(30)
            lifeDialog.dismiss()
        }

        btnHp40.setOnClickListener {
            setHp?.getHp(40)
            lifeDialog.dismiss()
        }

        lifeDialog.show()
    }
}