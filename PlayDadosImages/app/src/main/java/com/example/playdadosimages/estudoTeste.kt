package com.example.playdadosimages

fun main(){
    val jogador = Dados(6)
    print("${jogador.jogarDados()}")

}



class Dados2(val lados : Int) {
    fun jogarDados(): Int{
        return (1..lados).random()
    }

    fun resultLancDados(){

    }
}