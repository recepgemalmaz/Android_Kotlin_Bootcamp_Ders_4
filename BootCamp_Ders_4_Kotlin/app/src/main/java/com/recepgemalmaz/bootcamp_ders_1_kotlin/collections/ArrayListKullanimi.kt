package com.recepgemalmaz.bootcamp_ders_1_kotlin.collections

fun main(){


    val meyveler = ArrayList<String>()

    //VERI EKLEME
    meyveler.add("Elma") //0 index
    meyveler.add("Armut")//1 index
    meyveler.add("Kiraz")
    meyveler.add("Karpuz")
    meyveler.add("Kavun")
    meyveler.add("Muz")
    meyveler.add("Çilek")
    println(meyveler)

    //guncelleme
    meyveler[0] = "Ayva"
    meyveler[1] = "Üzüm"
    println(meyveler)

    //insert
    meyveler.add(0,"Kivi")
    println(meyveler)

    //okumA
    val meyve0 = meyveler.get(0)
    println(meyve0)

    //size
    val meyveSize = meyveler.size
    println("meyveSize: $meyveSize")

    meyveler.sort()
    println(meyveler)

    for (meyve in meyveler.sorted()){
        println(meyve)
    }

    for ( (i, meyve) in meyveler.withIndex()){
        println("$i. meyve: $meyve")
    }


    //silme
    meyveler.remove("Kivi")
    println(meyveler)
   //index ile silme
    meyveler.removeAt(0)
    println(meyveler)

    //clear
    meyveler.clear()

    //Mutable List : hem okuma hem yazma
    //Immutable List : sadece okuma

}