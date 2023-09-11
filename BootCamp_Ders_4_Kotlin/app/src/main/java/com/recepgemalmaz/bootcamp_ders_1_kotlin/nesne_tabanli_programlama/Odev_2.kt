package com.recepgemalmaz.bootcamp_ders_1_kotlin.nesne_tabanli_programlama

class Odev_2 {


    //1. Parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten sonra geri döndüren bir metod yazınız. F = C * 1.8 + 32

    fun soru1(derece: Double): Double {
        if (derece < -273.15) {
            println("Geçersiz derece. Lutfen -273.15 veya daha buyuk bir değer giriniz.")
            return 0.0
        }
        else{
            val fahrenheit = (derece * 1.8) + 32
            return fahrenheit
        }
    }

    //2. Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir metod yazınız.

    fun soru2(edge1: Int, edge2: Int) {

        if (edge1 <= 0 || edge2 <= 0) {
            println("Geçersiz kenar uzunluğu. Lutfen 0 dan buyuk bir değer giriniz.")
            return
        }
        else {
            val perimeter = (edge1 + edge2) * 2
            println("Dikdörtgenin çevresi: $perimeter cm")
        }

    }

    //3. Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız.

    fun soru3(number: Int): Int {

        if (number < 0) {
            println("Geçersiz sayı. Lutfen 0 veya daha buyuk bir değer giriniz.")
            return 0
        }
        else{
            var factorial = 1
            for (i in 1..number) {
                factorial *= i
            }
            return factorial

        }
    }

    //4. Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu  gösteren bir metod yazınız.

    fun soru4(word: String) {

        if (word.isEmpty()) {
            println("Geçersiz kelime. Lutfen bir kelime giriniz.")
            return
        }
        else{
            var count = 0
            for (i in word) {
                if (i == 'a' || i == 'A') {
                    count++
                }
            }
            println("Kelime içindeki a harfi sayısı: $count")
        }
    }

    //5. Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen metod yazınız.
    //İç açılar toplamı = (Kenar sayısı - 2) x 180

    fun soru5(edge: Int): Int {
        if(edge < 3){
            println("Geçersiz kenar sayısı. Lutfen 3 veya daha buyuk bir değer giriniz.")
            return 0
        }
        else{
            val totalAngle = (edge - 2) * 180
            return totalAngle
        }
    }

    //6. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
    // 1 günde 8 saat çalışılabilir.
    // Çalışma saat ücreti : 10₺
    // Mesai saat ücreti : 20₺
    // 160 saat üzeri mesai sayılır.

    fun soru6(daysWorked: Int): Int {
        val hourlyWage = 10 // TL
        val overtimeHourlyWage = 20 // TL
        val hoursPerDay = 8
        val totalSalary: Int // TL

        if (daysWorked <= 0 || daysWorked > 30) {
            println("Geçersiz gün sayısı. Lutfen 1-30 arasında bir değer giriniz.")
            return 0 // Geçersiz gün sayısı.
        } else {

            val totalWorkHours = daysWorked * hoursPerDay

            if (totalWorkHours <= 160) {

                totalSalary = totalWorkHours * hourlyWage

                return totalSalary
            } else {
                val regularWorkHours = 160
                val overtimeHours = totalWorkHours - regularWorkHours

                val regularSalary = regularWorkHours * hourlyWage
                val overtimeSalary = overtimeHours * overtimeHourlyWage

                totalSalary = regularSalary + overtimeSalary

                return totalSalary
            }


        }

    }

    //7.Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
    //50GB = 100₺
    //Kota aşımından sonra her 1GB, 4₺'dir.

    fun soru7(usedDataInGB: Int): Int {
        val basePrice = 100 // TL
        val additionalDataCostPerGB = 4 // TL per GB
        val dataCap = 50 // GB
        val totalPrice: Int // TL

        if (usedDataInGB < 0) {
            println("Geçersiz kota miktarı. Lutfen 0 veya daha buyuk bir değer giriniz.")
            return 0
        }

        else if( usedDataInGB <= dataCap ){
            totalPrice = basePrice
            return totalPrice
        }

        else{
            val additionalData = usedDataInGB - dataCap
            val additionalCost = additionalData * additionalDataCostPerGB
            totalPrice = basePrice + additionalCost
            return totalPrice
        }

    }





}