package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

class Fonksiyonlar {

    //void : geri donus degeri olmayan fonksiyonlar

    fun selamla1(){
       val sonuc = "Merhaba Recep"
       println(sonuc)
    }



    //return : geri donus degeri olan fonksiyonlar

    fun selamla2(): String{
        val sonuc = "Merhaba Recep"
        return sonuc
    }

    //parametre : disardan deger alabilen fonksiyonlar

    fun selamla1(isim: String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(sayi1 : Int, sayi2 : Int) : Int{
        return sayi1 + sayi2
    }

    //Overloading : ayni isimde farkli parametreler alan fonksiyonlar

    fun carpma(sayi1 : Int, sayi2 : Int) {
        println("Carpma: ${sayi1 * sayi2}")
    }
    fun carpma(sayi1 : Double, sayi2 : Double)  {
        println("Carpma: ${sayi1 * sayi2}")
    }

    fun carpma(sayi1 : Int, sayi2 : Int, sayi3 : Int) {
        println("Carpma: ${sayi1 * sayi2 * sayi3}")
    }

}