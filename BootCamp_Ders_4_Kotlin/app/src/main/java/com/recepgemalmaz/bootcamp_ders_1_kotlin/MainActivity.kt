package com.recepgemalmaz.bootcamp_ders_1_kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var mesaj : String? = null

    lateinit var yazi : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        yazi = "Merhaba"
        //lateinit : ileride deger atayacagimiz degiskenler icin kullanilir
        //lateinit primitive tiplerde kullanilamaz

        //Color.BLACK
    }
}