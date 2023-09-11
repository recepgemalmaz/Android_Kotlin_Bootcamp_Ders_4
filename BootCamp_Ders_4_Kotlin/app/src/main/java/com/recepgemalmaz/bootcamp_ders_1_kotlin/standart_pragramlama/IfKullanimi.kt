package com.recepgemalmaz.bootcamp_ders_1_kotlin.standart_pragramlama

fun main(){

    val yas = 19;
    val isim1 = "ahmet"
    val isim2 = "mehmet"

    if(yas >= 18 && isim1 == "ahmet") {
        println("Evet, bu kisi ehliyet alabilir")
    }
    else if(yas >= 18 && isim2 == "mehmet") {
        println("Evet, bu kisi ehliyet alabilir")
    }
    else {
        println("Hayir, bu kisi ehliyet alamaz")
    }


    val ka = "admin"
    val s = 123456

    if((ka.equals("admin")) && (s.equals(123456) )) println("Giris basarili")
    else println("Giris basarisiz")


    val sayi =10

    if(sayi ==10 || sayi == 20) {
        println("Sayi 10 veya 20")
    }
    else {
        println("Sayi 10 veya 20 degil")
    }

    val gun = 3

    when(gun) {
        1 -> println("Pazartesi")
        2 -> println("Sali")
        3 -> println("Carsamba")
        4 -> println("Persembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Gecersiz gun")
    }

}