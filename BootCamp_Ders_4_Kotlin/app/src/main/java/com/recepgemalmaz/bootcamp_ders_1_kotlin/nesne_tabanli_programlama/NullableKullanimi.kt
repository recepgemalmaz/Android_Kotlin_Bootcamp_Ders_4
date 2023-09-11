package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

fun main(){

    //Nullable Kullanimi
    //null - NaN - nil
    //null olabilen degiskenler


    //Tanimlama
    var mesaj : String? = null

    //mesaj = "Merhaba"

    //Yontem 1
    println("Yontem1: ${mesaj?.uppercase()}")

    //Yontem 2
    //println("Yontem2: ${mesaj!!.uppercase()}")

    //Yontem3
    if (mesaj != null) {
        println("Yontem3: ${mesaj.uppercase()}")

    }
    else{
        println("Yontem3: Mesaj null")
    }

    //Yontem4
    mesaj?.let {
        println("Yontem4: ${mesaj.uppercase()}")
    } ?: println("Yontem4: Mesaj null")

}