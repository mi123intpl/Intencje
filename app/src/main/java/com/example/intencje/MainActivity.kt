package com.example.intencje

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun otworzDrugaAktywnosc(przycisk: View) {
        val intencja = Intent(
            this,
            DrugaAktywnosc::class.java)
        startActivity(intencja)
    }

    fun otworzPrzegladarke(przycisk: View) {
        val intencja = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("http://www.wikipedia.pl"))
        startActivity(intencja)
    }
}