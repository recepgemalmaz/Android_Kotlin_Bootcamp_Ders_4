package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama.Compositation

fun main(){

    val k1 = Katagoriler(1,"Dram")
    val k2 = Katagoriler(2,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Christopher Nolan")
    val y2 = Yonetmenler(2,"Steven Spielberg")

    val f1 = Filmler(1,"Inception",2010,k1,y1)
    val f2 = Filmler(2,"Interstellar",2014,k1,y2)

    println("Film ID: ${f1.film_id}")
    println("Film Ad: ${f1.film_ad}")
    println("Film Yıl: ${f1.film_yil}")
    println("Film Katagori Ad: ${f1.katagori.katagori_Ad}")
    println("Film Yönetmen Ad: ${f1.yonetmen.yonetmen_ad}")


}