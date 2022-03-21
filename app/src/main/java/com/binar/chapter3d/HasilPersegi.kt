package com.binar.chapter3d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilPersegi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_persegi)

        var input = intent.getParcelableExtra("input") as PersegiPanjang?

        var txtHasil : TextView = findViewById(R.id.hasilTxt)
        txtHasil.text = (input?.panjang?.times(input.lebar)).toString()
    }
}