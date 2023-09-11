package com.recepgemalmaz.bootcamp_ders_1_kotlin.ileri

fun main() {
    //1.Compile Error : try-catch-finally

    val sayi = 10
    //sayi = 20


    //2. RunTime Error : exception handling

    val x = 10
    val y = 0

   // println("Sonuc : ${x / y}")
   // println("Islem Bitti")

    //onlem alma
    try {
        println("Sonuc : ${x / y}")
    } catch (e: Exception) {
        println("Hata : ${e.message}")
    } finally {
        println("Islem Bitti")
    }

}