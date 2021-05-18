package com.mlazza.diocollections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 1400.0, "CLT")
    val pedroca = Funcionario("Pedro", 4100.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {println(it)}

    println("--------------LIST------------------")
    funcionarios.add(pedroca)
    funcionarios.forEach {println(it)}

    println("--------------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach {println(it)}

    println("--------------SET------------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach {println(it)}

    println("--------------SET------------------")
    funcionarioSet.add(pedroca)
    funcionarioSet.add(maria)
    funcionarioSet.forEach {println(it)}

    println("--------------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach {println(it)}



}