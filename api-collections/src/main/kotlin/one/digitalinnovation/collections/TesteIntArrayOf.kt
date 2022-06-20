package one.digitalinnovation.collections

fun main() {
    //Array flexível, sem capacidade de tamanho
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("-------- Ordenação --------")
    values.sort()
    values.forEach {
        println(it)
    }
}