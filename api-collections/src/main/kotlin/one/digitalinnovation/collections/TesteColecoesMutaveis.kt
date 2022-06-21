package one.digitalinnovation.collections

fun main() {
    val margot = Funcionario("Margot", 2700.0, "PJ")
    val victor = Funcionario("Victor", 7000.0, "PJ")
    val pedro = Funcionario("Pedro", 1200.0, "CLT")

    println("--------- Lista com Victor e Pedro ---------")
    val funcionarios = mutableListOf(victor, pedro)
    funcionarios.forEach { println(it) }

    println("-------- Adicionando Margot --------")
    funcionarios.add(margot)
    funcionarios.forEach { println(it) }

    println("-------- Removendo Pedro --------")
    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }

    println("--------- Set com Victor ---------")
    val funcionarioSet = mutableSetOf(victor)
    funcionarioSet.forEach { println(it) }

    println("--------- Adicionando Margot e Pedro ---------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(margot)
    funcionarioSet.forEach { println(it) }

    println("--------- Removendo Margot ---------")
    funcionarioSet.remove(margot)
    funcionarioSet.forEach { println(it) }
}