package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2250.0, 4001.0, 4000.5, 5000.1)

    println("---------- Lista de salários ----------")
    for (salario in salarios) {
        println(salario)
    }

    println("---------- Maior, menor e média ----------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("---------- Salários maiores que 2500 ----------")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }

    println("---------- Quantidade de salários entre 2000 e 5000 ----------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("---------- Encontre os salários de 2250 ou de 500 ----------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("---------- Existem salários de 1000 ou de 4000.5? ----------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 4000.5 })
}