package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val joao = Cliente(
        nome = "Joao Miguel",
        cpf = "321.321.321-11",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(joao)
    TesteAutenticacao.autentica(joao)
}