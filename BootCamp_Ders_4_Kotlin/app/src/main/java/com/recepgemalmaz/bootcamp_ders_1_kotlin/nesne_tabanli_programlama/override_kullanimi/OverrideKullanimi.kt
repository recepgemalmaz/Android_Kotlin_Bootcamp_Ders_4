package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama.override_kullanimi

fun main(){

    val hayvan  = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()


    hayvan.sesCikar() //kalitim yok kendi fonksiyonu calisir
    memeli.sesCikar() //kalitim var override edilmemis fonksiyon calisir
    kedi.sesCikar() //kalitim var override edilmis  kendi fonksiyon calisir
    kopek.sesCikar() //kalitim var override edilmis  kendi fonksiyon calisir


}