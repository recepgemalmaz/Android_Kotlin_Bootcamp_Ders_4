package com.recepgemalmaz.bootcamp_ders_1_kotlin.collections

fun main(){

    val meyveler = HashSet<String>()

    meyveler.add("elma")
    meyveler.add("armut")//aynı elemanı eklemeye çalışırsak eklenmez
    meyveler.add("armut")
    meyveler.add("muz")
    meyveler.add("Kiraz")

    println(meyveler)

    meyveler.add("seftali")
    println(meyveler)

    val meyve = meyveler.elementAt(2)
    println("2. eleman : $meyve")

    println("Boyut : ${meyveler.size}")

    //donguler ile okuma

    for (m in meyveler){
        println("meyve : $m")
    }

    //index ile
    for ((i,m) in meyveler.withIndex()){
        println("$i. meyve : $m")
    }

    //silme

    meyveler.remove("armut")
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}
