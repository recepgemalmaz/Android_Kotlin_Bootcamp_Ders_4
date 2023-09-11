package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

fun main() {


    //Enumaration Kullanımı
    //Enumaration: Birbirine benzeyen sabitlerin bir arada tutulması

    ucretHesapla(45, KonserveBoyut.KUCUK)
    ucretHesapla(45, KonserveBoyut.ORTA)
    ucretHesapla(45, KonserveBoyut.BUYUK)


}

fun ucretHesapla( adet : Int, boyut : KonserveBoyut) {

    when(boyut){
        KonserveBoyut.KUCUK -> println("Ucret: ${adet * 14} ₺")
        KonserveBoyut.ORTA -> println("Ucret: ${adet * 25} ₺")
        KonserveBoyut.BUYUK -> println("Ucret: ${adet * 48} ₺")
    }


}