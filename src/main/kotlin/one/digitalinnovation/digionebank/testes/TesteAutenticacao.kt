package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Logavel

class TesteAutenticacao {
    companion object{
        fun autentica(logavel: Logavel) = println(logavel.login())
    }
}