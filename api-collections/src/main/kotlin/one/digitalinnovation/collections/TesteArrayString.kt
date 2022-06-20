package one.digitalinnovation.collections

fun main() {

    println("------- Forma 1 -------")
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Carlos"
    nomes[2] = "André"

    for (nome in nomes) {
        println(nome)
    }

    println("------- Forma 2 com ordenação -------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("------- Forma 2 com ordenação no arrayOf -------")
    val nomes2 = arrayOf("César", "Tina", "Dudu")
    nomes2.sort()
    nomes2.forEach { println(it) }
}