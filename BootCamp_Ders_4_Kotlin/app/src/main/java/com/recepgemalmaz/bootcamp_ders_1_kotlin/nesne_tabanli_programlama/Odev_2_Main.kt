package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

fun main(){


    val odev2 = Odev_2()

    println("--------------------Soru-1--------------------")
    //Soru-1 Main

    val fahrenhiet = odev2.soru1(30.0)
    println("Girilen Derecenin Fahrenheit Karşılığı: $fahrenhiet")

    println("--------------------Soru-2--------------------")
    //Soru-2 Main

    odev2.soru2(20, 30)


    println("--------------------Soru-3--------------------")
    //Soru-3 Main

    val faktoriyelResult = odev2.soru3(5)
    println("Girilen Sayının Faktoriyeli: $faktoriyelResult")

    println("--------------------Soru-4--------------------")
    //Soru-4 Main

    odev2.soru4("Recep GemalmAz")

    println("--------------------Soru-5--------------------")
    //Soru-5 Main

    val totalAngle = odev2.soru5(4)
    println("Girilen Kenar Sayısına Göre İç Açılar Toplamı: $totalAngle")

    println("--------------------Soru-6--------------------")

    //Soru-6 Main
    val totalSalary = odev2.soru6(30)
    println("Girilen Gün Sayısına Göre Maaş: $totalSalary")

    println("--------------------Soru-7--------------------")

    //Soru-7 Main
    val totalPrice = odev2.soru7(51)
    println("Girilen Kota Miktarina Göre Odenecek Ucret: $totalPrice")



}