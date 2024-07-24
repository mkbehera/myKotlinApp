package com.wipro.kotlin.basics.conditionalexpression

fun main(){
    var input = 1066
    when (input) {
        in 1..10 -> println("input is part of theis range from 1 to 100")
        !in 1..100 -> println("input is not part of theis range from 1 to 100")

    }
}