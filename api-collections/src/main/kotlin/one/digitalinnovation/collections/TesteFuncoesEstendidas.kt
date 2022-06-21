package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "6000".toBigDecimal(),
        "2500".toBigDecimal(),
        "1500".toBigDecimal()
    )

    println("--------- Somatória ---------")
    println(salarios.somatoria())

    println("--------- Média ---------")
    println(salarios.media())
}