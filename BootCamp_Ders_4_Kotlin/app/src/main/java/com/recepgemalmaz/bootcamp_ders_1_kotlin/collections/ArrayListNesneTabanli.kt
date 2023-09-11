package com.recepgemalmaz.bootcamp_ders_1_kotlin.collections

fun main(){


    val o1 = Ogrenciler(2,"Recep")
    val o2 = Ogrenciler(1,"Ahmet")
    val o3 = Ogrenciler(3,"Mehmet")

    val ogrencilerListesi = ArrayList<Ogrenciler>()

    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for ( o in ogrencilerListesi){

        println(o.no.toString() + " " + o.ad)
    }

    //siralama yapmak icin short fonksiyonu kullanilir
    println("Sayisal : Kucukten > Buyuge")
    val s1 = ogrencilerListesi.sortedWith(compareBy({it.no})) //Ascending : ASC

    for ( o in s1){

        println(o.no.toString() + " " + o.ad)
    }

    println("Sayisal : Buyukten > Kucuge")
    val s2 = ogrencilerListesi.sortedWith(compareByDescending ({it.no})) // Descending : DESC

    for ( o in s2){

        println(o.no.toString() + " " + o.ad)
    }

    println("Harfsel : Kucukten > Buyuge")
    val s3 = ogrencilerListesi.sortedWith(compareBy({it.ad})) //Ascending : ASC

    for ( o in s3){

        println(o.no.toString() + " " + o.ad)
    }

    println("Harfsel : Buyukten > Kucuge")
    val s4 = ogrencilerListesi.sortedWith(compareByDescending ({it.ad})) // Descending : DESC

    for ( o in s4){

        println(o.no.toString() + " " + o.ad)
    }

    //Filtreleme

    println("Filtreleme -1 ")
    val f1 = ogrencilerListesi.filter { it.no > 1 && it.no < 3 }
    for ( o in f1){

        println(o.no.toString() + " " + o.ad)
    }

    println("Filtreleme -2 ")
    val f2 = ogrencilerListesi.filter { it.ad.contains("p") }
    for ( o in f2){

        println(o.no.toString() + " " + o.ad)
    }

}