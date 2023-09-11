package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

class ClassA : MyInterface{
    override val degisken: Int =10


    override fun method1() {
        println("method1 calisti")
    }

    override fun method2(): String {
        return "method2 calisti"
    }


}