package com.mlazza.diocollections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }

    println("----Ordenando-----")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("outro Array do tipo arrayOf")
    val nomes2 = arrayOf("Madruga", "Girafalis", "Chaves")
    nomes2.sort()
    nomes2.forEach { println(it) }
}