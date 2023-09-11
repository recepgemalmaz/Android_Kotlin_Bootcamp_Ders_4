package com.recepgemalmaz.bootcamp_ders_1_kotlin.degiskenler

fun main(){

    var sayi1 = 10
    //Sayisaldan Sayisala Donusum int to double
    var sayi2 : Double = sayi1.toDouble()

    val sayi3 = 20.9
    //Sayisaldan Sayisala Donusum double to int
    var sayi4 : Int = sayi3.toInt()


    println("Sayi1: $sayi1")
    println("Sayi2: $sayi2")
    println("Sayi3: $sayi3")
    println("Sayi4: $sayi4")


    var sayi5 = 30.9
    //Sayisaldan Metine Donusum
    var sayi6 : String = sayi5.toString()

    println ("Sayi5: $sayi5")
    println ("Sayi6: $sayi6")

    var sayi7 = "40.9"
    //Metinden Sayisala Donusum
    var sayi8 : Double = sayi7.toDouble()

    println ("Sayi7: $sayi7")
    println ("Sayi8: $sayi8")

    val sayi9 = "50.99999a"

    var sayi10  = sayi9.toDoubleOrNull()

    if (sayi10 != null){
        println(sayi10)

    }
    else{
        println("Donusum Hatasi")
    }

    var sayi11 = "60.9a"

    val sayi12 = sayi11.toDoubleOrNull()

    sayi12?.let {
        println(it)
    } ?: run {
        println("Donusum Hatasi")
    }
}