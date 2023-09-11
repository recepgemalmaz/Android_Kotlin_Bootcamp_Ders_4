package com.recepgemalmaz.bootcamp_ders_1_kotlin.standart_pragramlama

fun main(){

    for (i in 1  .. 3) {
        println("Dongu $i = $i")
    }

    //10 ile 20 arasinda 5 er 5 er artsin
    for (i in 10 .. 20 step 5) {
        println("Dongu = $i")
    }

    //20 den 10 a 5 er 5 er azalsin
    for (i in 20 downTo 10 step 5) {
        println("Dongu = $i")
    }

    var sayac =1
    while (sayac <= 10) {
        println("Sayac = $sayac")
        sayac++
    }

    for (i in 1..10){
        if (i == 3) {
            break
        }
        println("Dongu5 = $i")
    }

    for (i in 1..10){
        if (i == 5) {
            continue
        }
        println("Dongu6 = $i")
    }
}