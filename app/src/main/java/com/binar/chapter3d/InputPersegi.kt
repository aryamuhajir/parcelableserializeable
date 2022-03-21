package com.binar.chapter3d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class InputPersegi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_persegi)

        luas()
    }

    private fun luas() {
        var btnHitung : Button = findViewById(R.id.btnHitung)
        var panjangEdit : EditText = findViewById(R.id.panjangEdit)
        var lebarEdit : EditText = findViewById(R.id.lebarEdit)

        btnHitung.setOnClickListener{
            val intent = Intent(this, HasilPersegi::class.java)
            var dataLuas = PersegiPanjang(panjangEdit.text.toString().toInt(),lebarEdit.text.toString().toInt())

            intent.putExtra("input", dataLuas)
            startActivity(intent)
        }
    }
}