package com.mlazza.diocollections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 1400.0, "CLT")
    val pedroca = Funcionario("Pedro", 4100.0, "PJ")

    val funcionarios = listOf(joao, maria, pedroca)

    funcionarios.forEach{ println(it)}

    println("-------------------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("-------------------------")
    //ordenar pelo salario
    funcionarios.sortedBy { it.salario }
        .forEach { println(it) }

    println("-------------------------")
    // por agrupamento de contratacao
    funcionarios.groupBy { it.contrato }
        .forEach { println(it) }


}

data class Funcionario (
    val nome: String,
    val salario: Double,
    val contrato: String
) {
    override fun toString(): String =
        """
                Nome:       $nome
                Salário:    $salario
            """.trimIndent()

}