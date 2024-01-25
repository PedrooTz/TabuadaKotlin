package br.senai.sp.jandira.tabuada

fun main() {

    println("       TABUADA         ")
    println("")
    println("Insira o multiplicador: ")
    var numero = readln().toInt()

    println("Insira o multiplicador mínimo: " )
    var minimo = readln().toInt()

    println("Insira o multiplicador máximo: ")
    var maximo = readln().toInt()

    println("Sua tabuada com o $numero: ")

    for(valor in minimo..maximo) {
        println("$numero  x $valor = ${numero * valor}")
    }


}