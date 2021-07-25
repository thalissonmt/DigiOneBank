package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Thalisson"
    var cpf: String = "123.123.123-12"
}

fun main(){
    val tmt = Pessoa()
    println(tmt.nome)
    println(tmt.cpf)
}