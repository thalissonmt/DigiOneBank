package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne",numero = 12)

    val banco2 = digiOneBank.copy(nome = "Memes")

    println(banco2.info())
}