package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

fun main() {

    val fonksiyonlar = Fonksiyonlar()
    fonksiyonlar.selamla1()

    val sonuc = fonksiyonlar.selamla2()
    println("Gelen Sonuc: $sonuc")

    fonksiyonlar.selamla1("Recep")

    val toplam = fonksiyonlar.toplama(5, 10)
    println(toplam)

    fonksiyonlar.carpma(5, 10)

    fonksiyonlar.carpma(5.0, 10.0)

    fonksiyonlar.carpma(5, 10, 15)

    val sonuc1 = 6 carpi 3
    println(sonuc1)

}

//Extension Functions
//Bir sinifa ait olmayan fonksiyonlari o sinifa eklemek

infix fun Int.carpi(sayi: Int): Int {
    return this * sayi
}


