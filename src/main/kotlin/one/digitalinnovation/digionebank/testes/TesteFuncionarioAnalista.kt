package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val jose = Analista("Jose Mathias","123.123.123-47", 2500.0)

    ImprimeRelatorioFuncionario.imprime(jose)
}