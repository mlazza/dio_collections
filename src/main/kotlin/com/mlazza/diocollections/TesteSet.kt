package com.mlazza.diocollections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 1400.0, "CLT")
    val pedroca = Funcionario("Pedro", 4100.0, "PJ")

    val funcionarios1 = setOf(joao, pedroca)
    val funcionarios2 = setOf(maria)

    //UNION
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach {println(it)}

    //SUBTRACT
    println("-----------------------------")
    val funcionarios3 = setOf(joao, pedroca, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {println(it)}

    //INTERSECT
    println("-----------------------------")
    val resultInters = funcionarios3.intersect(funcionarios2)
    resultInters.forEach {println(it)}
}