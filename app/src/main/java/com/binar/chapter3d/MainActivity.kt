package com.binar.chapter3d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //parsingSerializable()
        parsingParcelable()



    }

    private fun parsingParcelable() {
        val btnPro2 : Button = findViewById(R.id.progress2)

        btnPro2.setOnClickListener {
            val pindah = Intent(this, SecondActivity::class.java)
            val dataPerson = PersonParcel("Hajir", "hahiur@gmai.com")
            pindah.putExtra("person", dataPerson)
            startActivity(pindah)

        }
    }

    private fun parsingSerializable() {
        val btnPro : Button = findViewById(R.id.progress)

        btnPro.setOnClickListener {
            val pindah = Intent(this, SecondActivity::class.java)
            val dataPerson = Person("Hajir", 19, "Sidoarjo","Nonton")
            pindah.putExtra("person", dataPerson)
            startActivity(pindah)

        }
    }
}