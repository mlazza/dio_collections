package com.mlazza.diocollections

fun main() {

    //declarando Pair
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    //OUTRA MANEIRA DE FAZER UM MAP, MAIS CONCISA
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    //iterando
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")}
}