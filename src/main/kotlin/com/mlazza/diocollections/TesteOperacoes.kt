package com.mlazza.diocollections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 800.0, 4100.0, 950.0, 9850.0)

    for (salario in salarios) {
        println(salario)
    }

    println("----------------------")

    //maior, menor e media dos salarios
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarios: ${salarios.average()}")
    println("----------------------")

    //filtrando salarios maiores do que 1500
    val salmaior1500 = salarios.filter { it > 1500}
    salmaior1500.forEach {println(it)}

    //contando e filtrando por um range de valores dos salarios
    println("----------------------")
    println(salarios.count {it in 2000.0..5000.0})
    println("----------------------")
    println(salarios.find {it == 2250.0})
    println(salarios.find {it == 150.0})
    println(salarios.any {it == 800.0})
    println(salarios.any {it == 80.0})

}