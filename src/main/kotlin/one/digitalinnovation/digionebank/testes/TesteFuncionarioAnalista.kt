package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val pedro = Analista("Pedro José", "987.654.321-01", 2000.0)
    ImprimeRelatorioFuncionario.imprime(pedro)
}