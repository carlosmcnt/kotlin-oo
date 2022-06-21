package one.digitalinnovation.collections

fun main() {
    val margot = Funcionario("Margot", 2700.0, "PJ")
    val victor = Funcionario("Victor", 7000.0, "PJ")
    val pedro = Funcionario("Pedro", 1200.0, "Estágio")

    val funcionarios1 = setOf(margot, pedro)
    val funcionarios2 = setOf(victor)

    println("-------- União de conjuntos --------")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-------- Subtração de conjuntos --------")
    val funcionarios3 = setOf(margot, victor, pedro)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-------- Intersecção entre conjuntos --------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}