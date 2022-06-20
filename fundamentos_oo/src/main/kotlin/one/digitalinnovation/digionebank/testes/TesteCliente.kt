package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José Silveira",
        cpf = "246.135.999-88",
        clienteTipo = ClienteTipo.PF,
        senha = "123456789"
    )

    println(jose)
    TesteAutenticacao().autentica(jose)
}