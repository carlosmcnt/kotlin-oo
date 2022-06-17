package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Andrade", "135.792.468-10", 7000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
