package com.prashuk69gmail.sampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // in C++
//        string s = "gagan";
//
//        // in java
//        String s = "gagan";
//
//        // in kotlin
//        val s : String = "gagan"        // pascal notation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // in java we have to correlate everything with the help of findViewById(R.id.id_name)


        btnConvert.setOnClickListener {
            val tempCel = etTempCel.text.toString().toInt()
            val tempFahr = (9/5).toDouble() * tempCel + 32;
            etTempFahren.setText(tempFahr.toString())

        }

    }
}
