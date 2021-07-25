package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val pf = ClienteTipo.PF
    println("-- ${pf.name} - ${pf.description}")

    val pj = ClienteTipo.PJ
    println("++ ${pj.name} - ${pj.description}")
}