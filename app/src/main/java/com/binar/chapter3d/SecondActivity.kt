package com.binar.chapter3d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //val dataPerson = intent.getSerializableExtra("person") as Person
        val dataPerson = intent.getParcelableExtra("person") as PersonParcel?
        val txt : TextView = findViewById(R.id.txtData)
        txt.text = dataPerson?.nama
        val txt2 : TextView = findViewById(R.id.txtData2)
        txt2.text = dataPerson?.email.toString()
        //val txt3 : TextView = findViewById(R.id.txtData3)
        //txt3.text = dataPerson.alamat
        //val txt4 : TextView = findViewById(R.id.txtData4)
        //txt4.text = dataPerson.hobi

        //var umur = dataPerson.umur
        //val txt5 : TextView = findViewById(R.id.txtData5)
        //if (umur % 2 == 0){
            //txt5.text = "Umur anda genap"
        //}else{
            //txt5.text = "Umur anda ganjil"

        //}
    }
}