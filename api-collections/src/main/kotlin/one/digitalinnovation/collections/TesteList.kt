package one.digitalinnovation.collections

fun main() {
    val jonas = Funcionario("Jonas", 5000.0, "CLT")
    val margot = Funcionario("Margot", 2700.0, "PJ")
    val cesar = Funcionario("César", 3450.0, "CLT")
    val victor = Funcionario("Victor", 7000.0, "PJ")
    val pedro = Funcionario("Pedro", 1200.0, "Estágio")

    val funcionarios = listOf(jonas, margot, cesar, victor, pedro)

    println("-------- Lista de funcionários --------")
    funcionarios.forEach { println(it) }

    println("-------- Existe funcionária Margot? --------")
    println(funcionarios.find { it.nome == "Margot" })

    println("------- Ordenação por salário -------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------- Agrupando por contratação -------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}