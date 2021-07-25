package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria Jose","123.123.123-47", 5000.0, "senha12")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao.autentica(maria)
}