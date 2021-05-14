package com.mlazza.diocollections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1200.0
    salarios[1] = 4500.0
    salarios[2] = 2230.0

    salarios.forEach { println(it) }

    println("\nSalarios com adicionais:")
    salarios.forEachIndexed() { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    // outra forma de double array ja atribuindo os valores

    val salarios2 = doubleArrayOf(1200.0, 2200.0, 1000.0, 320.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}