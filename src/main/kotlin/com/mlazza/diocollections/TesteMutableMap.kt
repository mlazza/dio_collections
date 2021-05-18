package com.mlazza.diocollections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 1400.0, "CLT")
    val pedroca = Funcionario("Pedro", 4100.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedroca.nome, pedroca)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("---------------------------")

    repositorio.findAll().forEach {println(it)}

    println("---------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach {println(it)}
}