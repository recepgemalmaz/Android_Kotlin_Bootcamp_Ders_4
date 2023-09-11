package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

class Araba (var renk: String, var hiz: Int, var calisiyorMu : Boolean){

    init{
        println("Araba sinifi init blogu calisti")
    }

    fun bilgiAl(){

        println("-------------------")
        println("Araba rengi = $renk")
        println("Araba hizi = $hiz")
        println("Araba calisiyor mu = $calisiyorMu")
    }

    fun calsitir(){ //Side Effect
        calisiyorMu = true
        hiz = 1000
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm: Int){
        hiz += kacKm
    }

    fun yavasla(kacKm: Int){
        hiz -= kacKm
    }



    //Side Effect nedir?
    //Bir fonksiyonun disinda bir degiskeni degistirmek
    //Bir fonksiyonun disinda bir degiskeni okumak
    //Bir fonksiyonun disinda bir degiskeni yazmak
    //Bir fonksiyonun disinda bir degiskeni silmek
    //Bir fonksiyonun disinda bir degiskeni olusturmak
    //Bir fonksiyonun disinda bir degiskeni kopyalamak

    //this : bulundugu sinifin nesnesini gosterir
    //this@SinifAdi : bulundugu sinifin nesnesini gosterir
    //super : bulundugu sinifin ust sinifini gosterir

}