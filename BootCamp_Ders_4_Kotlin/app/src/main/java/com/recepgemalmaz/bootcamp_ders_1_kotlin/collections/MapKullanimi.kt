package com.recepgemalmaz.bootcamp_ders_1_kotlin.collections

fun main(){

    //Json = Javascript Object Notation : HashMap

    val iller = HashMap<Int,String>()
    iller.put(1,"Adana")
    iller.put(6,"Ankara")
    iller.put(34,"İstanbul")
    iller.put(35,"İzmir")
    iller.put(57, "Sinop")

    println(iller)

    //okuma
     val il  = iller.get(34)
    println(il)

    iller.put(34,"Yeni İstanbul")
    println(iller)

    println("Boyut : ${iller.size}")


    //deger okuma dongu

    for ((anahtar , deger) in iller){
        println("$anahtar : $deger")
    }

    //silme
    iller.remove(34)
    println(iller)

    //clear
    iller.clear()
    println(iller)

}