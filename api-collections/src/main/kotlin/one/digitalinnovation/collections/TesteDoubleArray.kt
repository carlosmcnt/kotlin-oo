package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    println("------------- Imprime salários -------------")
    salarios.forEach {
        println(it)
    }

    println("------------- Salários com bônus -------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println(it)
    }

    println("------------- Imprime salários com ArrayOf -------------")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }
}