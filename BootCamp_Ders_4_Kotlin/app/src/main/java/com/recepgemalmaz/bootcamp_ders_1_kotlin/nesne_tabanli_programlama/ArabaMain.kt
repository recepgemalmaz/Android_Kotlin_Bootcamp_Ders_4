package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

fun main(){
    var araba1 = Araba("Kirmizi", 0, false)
    var araba2 = Araba("Siyah", 200, true)
    var araba3 = Araba("Beyaz", 0, false)

    //deger okuma print
    println("-------------------")
    println("Araba1 rengi = ${araba1.renk}")
    println("Araba2 rengi = ${araba2.renk}")
    println("Araba3 rengi = ${araba3.renk}")

    println("-------------------")

    println("Araba1 hizi = ${araba1.hiz}")
    println("Araba2 hizi = ${araba2.hiz}")
    println("Araba3 hizi = ${araba3.hiz}")

    println("-------------------")

    println("Araba1 calisiyor mu = ${araba1.calisiyorMu}")
    println("Araba2 calisiyor mu = ${araba2.calisiyorMu}")
    println("Araba3 calisiyor mu = ${araba3.calisiyorMu}")

    //deger atama hiz

    araba1.hiz = 100
    araba2.hiz = 150
    araba3.hiz = 200
    //print
    println("-------------------")
    println("Araba1 hizi = ${araba1.hiz}")
    println("Araba2 hizi = ${araba2.hiz}")
    println("Araba3 hizi = ${araba3.hiz}")

    println("--------- BILGI AL ----------")

    araba1.bilgiAl()
    araba2.bilgiAl()
    araba3.bilgiAl()

    araba1.calsitir()
    araba2.calsitir()
    araba3.calsitir()

    println("-------------------")
    araba1.bilgiAl()
    araba2.bilgiAl()
    araba3.bilgiAl()

    araba1.durdur()
    araba2.durdur()
    araba3.durdur()

    //print
    println("-------------------")
    araba1.bilgiAl()
    araba2.bilgiAl()
    araba3.bilgiAl()


    araba1.hizlan(100)
    araba2.hizlan(200)
    araba3.hizlan(300)

    println("-------------------")
    araba1.bilgiAl()
    araba2.bilgiAl()
    araba3.bilgiAl()


    araba1.yavasla(50)
    araba2.yavasla(100)
    araba3.yavasla(150)

    println("-------------------")
    araba1.bilgiAl()
    araba2.bilgiAl()
    araba3.bilgiAl()


}