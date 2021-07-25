package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val tmt = Pessoa(nome = "Thalis", cpf = "123.123.123-47")
    println(tmt.nome)
    println(tmt.cpf)

    val jose = Funcionario("Thalisson Tavares","123.123.123-47", BigDecimal.valueOf(2000.0))
    println(jose.nome)
    println(jose.cpf)
    println(jose.salario)
}