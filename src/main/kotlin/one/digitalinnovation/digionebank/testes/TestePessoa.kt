package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val tmt = Pessoa(nome = "Thalis", cpf = "123.123.123-47")
    println(tmt.nome)
    println(tmt.cpf)
}