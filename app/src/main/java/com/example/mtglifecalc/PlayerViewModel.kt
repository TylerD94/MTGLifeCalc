package com.example.mtglifecalc

import androidx.lifecycle.ViewModel

class PlayerViewModel: ViewModel() {
    var startingHp = 40
    var p1Hp = 0
    var p2Hp = 0
    var p3Hp = 0
    var p4Hp = 0

    fun startGame(startHp: Int) {
        startingHp = startHp
        p1Hp = startingHp
        p2Hp = startingHp
        p3Hp = startingHp
        p4Hp = startingHp
    }

    fun increaseP1Hp() {
        p1Hp++
    }

    fun decreaseP1Hp() {
        p1Hp--
    }

    fun increaseP2Hp() {
        p2Hp++
    }

    fun decreaseP2Hp() {
        p2Hp--
    }

    fun increaseP3Hp() {
        p3Hp++
    }

    fun decreaseP3Hp() {
        p3Hp--
    }

    fun increaseP4Hp() {
        p4Hp++
    }

    fun decreaseP4Hp() {
        p4Hp--
    }

}