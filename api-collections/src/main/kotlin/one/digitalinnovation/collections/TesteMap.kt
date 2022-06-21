package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Bruno", 2000.0)

    println("---------- Map 1 ----------")
    val map1 = mapOf(pair)
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("---------- Map 2 ----------")
    val map2 = mapOf(
        "Lucas" to 2500.0,
        "Marta" to 3000.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}