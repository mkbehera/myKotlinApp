package com.wipro.kotlin.basics.conditionalexpression

fun main(){
    //simple when
    var x = 1
    when (x) {
        //1 -> println("x is 1")
        //2 -> println("x is 2")
        //else -> println("No Match Found")
        0, 1, 10 -> println("x value is 0 or 10")
        else -> println("No Match Found")
    }
}