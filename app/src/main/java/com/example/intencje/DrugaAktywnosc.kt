package com.example.intencje

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class DrugaAktywnosc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_druga_aktywnosc)
    }

    fun zamknijAktywnosc(przycisk: View) {
        finish()
    }
}